package blog.braindose.demo;

import io.quarkus.runtime.annotations.QuarkusMain;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import blog.braindose.demo.model.pnr.Booking;
import blog.braindose.demo.services.JsonMapper;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

@QuarkusMain
public class Generator {

    public static void main(String... args) {
        System.out.println("Running main method");
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            JsonMapper mapper = new JsonMapper();
            Gen gen = new Gen();

            List<Booking> newBookings = gen.create(900);
            StringBuffer b = new StringBuffer();
            /*
            newBookings.forEach(n -> {
                System.out.printf("new pnr: %s%n", n.getActivePNRimage().getAmadeusId().getReservation().getControlNumber());
                System.out.println("Booking Object: " + n);
                System.out.printf("Booking: %s%n", mapper.str(n));
            });
            */

            b.append(mapper.str(newBookings));

            FileOutputStream out = new FileOutputStream(new File("/Users/ganck/Downloads/sample-900.json"));
            out.write(b.toString().getBytes());
            out.close();

            Quarkus.waitForExit();
            return 0;
        }

        public Booking loadBooking() {
            JsonMapper mapper = new JsonMapper();
            List<Booking> bookingList = mapper
                    .readCollections("/Users/ganck/Documents/Gogs/sia-pods/samples/sample.json", Booking.class);
            return bookingList.get(0);
        }

        public class Gen {

            public Gen() {
            }

            public List<Booking> create(int numberOfRecord) {
                List<Booking> list = new ArrayList<>();
                for (int i = 0; i < numberOfRecord; i++) {
                    String n = randomPNR();
                    System.out.printf("pnr: %s%n", n);
                    Booking b = loadBooking();
                    b.getActivePNRimage().getAmadeusId().getReservation().setControlNumber(n);
                    list.add(b);

                }
                return list;
            }

            private String randomPNR() {
                Random r = new Random();

                StringBuilder s = r.ints(65, 91)
                        .limit(6)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
                int i = r.nextInt(0, 6);

                return s.replace(i, i + 1, "" + r.nextInt(1, 10)).toString();
            }
        }

    }

}
