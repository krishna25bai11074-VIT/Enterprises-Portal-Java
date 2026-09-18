import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("|----------------------------------------Swades Enterprises------------------------------------|");
        System.out.println("|---------------------------------------------Portal-------------------------------------------|");

        String ans = "y";
        while (ans.length() > 0 && (ans.charAt(0) == 'y' || ans.charAt(0) == 'Y')) {
            System.out.println("Dashboard:- 1) GST Information 📃");
            System.out.println("            2) GST Invoice Generator 💸");
            System.out.println("            3) Aniversary Special 🎁");
            System.out.println("            4) Enter More Information 📝");
            System.out.println("            5) Exit              ");
            System.out.print("Enter Any Option");
            
            int opt = 0;
            try {
                opt = Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Please Enter Valid Option");
                System.out.print("Do U Want to Work More{y/n}");
                ans = scanner.nextLine().trim();
                continue;
            }

            if (opt == 1) {
                System.out.println("Menu:-  1) Sale Price");
                System.out.println("        2) GST Percentage");
                System.out.println("        3) GST Rate");
                System.out.print("Choose:- ");
                int opt1 = 0;
                try {
                    opt1 = Integer.parseInt(scanner.nextLine().trim());
                } catch (Exception e) {
                    opt1 = -1;
                }

                if (opt1 == 1) {
                    System.out.println("Menu:-   1) Highest Sale Price");
                    System.out.println("         2) Lowest Sale Price");
                    System.out.println("         3) Average Sale Price");
                    System.out.println("         4) Total Sale Price");
                    System.out.println("         5) Most Frequent Sale Price");
                    System.out.print("Choose:-");
                    int opt2 = Integer.parseInt(scanner.nextLine().trim());
                    List<Double> P = new ArrayList<>();
                    for (Data.Record r : Data.Info) {
                        P.add(r.getPrice());
                    }
                    if (opt2 == 1) {
                        System.out.println("Highest Sale Price :- ₹ " + formatNum(getMax(P)));
                    } else if (opt2 == 2) {
                        System.out.println("Lowest Sale Price :- ₹ " + formatNum(getMin(P)));
                    } else if (opt2 == 3) {
                        System.out.println("Average Sale Price :- ₹ " + getMean(P));
                    } else if (opt2 == 4) {
                        System.out.println("Total Sale Price :- ₹ " + formatNum(getSum(P)));
                    } else if (opt2 == 5) {
                        System.out.println("Most Frequent Sale Price :- ₹ " + formatNum(getMode(P)));
                    }
                } else if (opt1 == 2) {
                    System.out.println("Menu:-   1) Highest GST Percentage Applied");
                    System.out.println("         2) Lowest GST Percentage Applied");
                    System.out.println("         3) Total GST Percentage Applied");
                    System.out.println("         4) Most Frequent GST Percentage Applied");
                    System.out.print("Choose:-");
                    int opt2 = Integer.parseInt(scanner.nextLine().trim());
                    List<Double> G = new ArrayList<>();
                    for (Data.Record r : Data.Info) {
                        G.add(r.getGstP());
                    }
                    if (opt2 == 1) {
                        System.out.println("Highest GST Percentage Applied :-  " + formatNum(getMax(G)) + " %");
                    } else if (opt2 == 2) {
                        System.out.println("Lowest GST Percentage Applied :-  " + formatNum(getMin(G)) + " %");
                    } else if (opt2 == 3) {
                        System.out.println("Total GST Percentage Applied :-  " + formatNum(getSum(G)) + " %");
                    } else if (opt2 == 4) {
                        System.out.println("Most Frequent GST Percentage Applied :-  " + formatNum(getMode(G)) + " %");
                    }
                } else if (opt1 == 3) {
                    System.out.println("Menu:-   1) Highest GST Rate Applied");
                    System.out.println("         2) Lowest GST Rate Applied");
                    System.out.println("         3) Total GST Rate Applied");
                    System.out.println("         4) Most Frequent GST Rate Applied");
                    System.out.print("Choose:-");
                    int opt2 = Integer.parseInt(scanner.nextLine().trim());
                    List<Double> R = new ArrayList<>();
                    for (Data.Record r : Data.Info) {
                        R.add(r.getGstR());
                    }
                    if (opt2 == 1) {
                        System.out.println("Highest GST Rate Applied :- ₹ " + formatNum(getMax(R)));
                    } else if (opt2 == 2) {
                        System.out.println("Lowest GST Rate Applied :- ₹ " + formatNum(getMin(R)));
                    } else if (opt2 == 3) {
                        System.out.println("Total GST Rate Applied :- ₹ " + formatNum(getSum(R)));
                    } else if (opt2 == 4) {
                        System.out.println("Most Frequent GST Rate Applied :- ₹ " + formatNum(getMode(R)));
                    }
                } else {
                    System.out.println("Enter Valid Option");
                }
            } else if (opt == 2) {
                System.out.println("|--------------------------------🪙💵 GST Invoice Generator 🪙💵-------------------------------|");
                System.out.println("");
                System.out.println("");
                System.out.print("Enter Name of Your Enterprise");
                String Enterprise_Name = scanner.nextLine();
                System.out.print("Enter  House Number/Plot Number");
                String H_No = scanner.nextLine();
                System.out.print("Enter Gali Number/Street Number/Lane Number");
                String Gali_No = scanner.nextLine();
                System.out.print("Enter Locality");
                String Locality = scanner.nextLine();
                System.out.print("Enter City");
                String City = scanner.nextLine();
                System.out.print("Enter State");
                String State = scanner.nextLine();
                System.out.print("Enter Shipping House No./Flat No.");
                String sh_tof = scanner.nextLine();
                System.out.print("Enter Shipping Locality/Appartments");
                String sh_toa = scanner.nextLine();
                System.out.print("Enter Shipping City");
                String sh_toc = scanner.nextLine();
                System.out.print("Enter Shipping State");
                String sh_tos = scanner.nextLine();
                System.out.print("Enter Name of Good");
                String Des_Go = scanner.nextLine();
                System.out.print("Enter Quantity of Item");
                int Qty = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Rate of Item");
                String Rate = scanner.nextLine();
                System.out.print("Enter GST Amount");
                String GST_Rate = scanner.nextLine();
                System.out.print("Enter GST Percentage");
                int GST_Per = Integer.parseInt(scanner.nextLine());

                printInvoice(Enterprise_Name, H_No, Gali_No, Locality, City, State, sh_tof, sh_toa, sh_toc, sh_tos, Des_Go, Qty, Rate, GST_Rate, GST_Per);
            } else if (opt == 3) {
                List<String> names = new ArrayList<>();
                for (Data.Record r : Data.Info) {
                    names.add(r.getName());
                }
                Random rand = new Random();
                String winner = names.get(rand.nextInt(names.size()));
                System.out.println("|-----------------Winner of the Prize form our Past Customer is- " + winner + " 🎉🥳");
            } else if (opt == 4) {
                System.out.print("Enter Name");
                String new_n = scanner.nextLine();
                System.out.print("Enter Product Sold");
                String new_p = scanner.nextLine();
                System.out.print("Enter Sale Price");
                double new_pr = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter GST Percentage Applied");
                double new_GST_p = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter GST Rate Applied");
                double new_GST_r = Double.parseDouble(scanner.nextLine());

                Data.Info.add(new Data.Record(new_n, new_p, new_pr, new_GST_p, new_GST_r));
                System.out.println("New Data Added Succesfully 🎉:)");
            } else if (opt == 5) {
                System.exit(0);
            } else {
                System.out.println("Please Enter Valid Option");
            }

            System.out.print("Do U Want to Work More{y/n}");
            ans = scanner.nextLine().trim();
        }

        System.out.println("Hope U Liked Our Portal");
        System.out.println("Thank You :)");
    }

    private static void printInvoice(String Enterprise_Name, String H_No, String Gali_No, String Locality,
                                     String City, String State, String sh_tof, String sh_toa,
                                     String sh_toc, String sh_tos, String Des_Go, int Qty,
                                     String Rate, String GST_Rate, int GST_Per) {
        System.out.println("");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("|                                       " + Enterprise_Name + "                                  |");
        System.out.println("|                                       " + H_No + " " + Gali_No + " " + Locality + "                                   |");
        System.out.println("|                                       " + City + " " + State + "                                    |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("| Shipping Address -- " + sh_tof + "                                                   |");
        System.out.println("|                    " + sh_toa + "                                                        |");
        System.out.println("|                    " + sh_toc + " " + sh_tos + "                                                       |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                             |");
        System.out.println("| Invoice No.-ACP/25-48/0013567                                           Dated-21-Nov-2025 |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("| S No. |    Description of Goods    | Quantity |   Rate   |  GST Rate  | GST Percentage |");
        System.out.println("|   1   |        " + padCenter(Des_Go, 19) + " |    " + Qty + "     | " + padLeft(Rate + "/-", 8) + " |  " + padLeft(GST_Rate + "/-", 8) + "  |       " + GST_Per + "%      |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|       |                            |          |          |            |                |");
        System.out.println("|_______|_____________________________|___________|___________|____Total -__|____1,05,000/-___|");
        System.out.println("");
    }

    private static String padCenter(String s, int width) {
        if (s.length() >= width) return s.substring(0, width);
        int left = (width - s.length()) / 2;
        int right = width - s.length() - left;
        return " ".repeat(left) + s + " ".repeat(right);
    }

    private static String padLeft(String s, int width) {
        if (s.length() >= width) return s;
        return " ".repeat(width - s.length()) + s;
    }

    private static double getMax(List<Double> list) {
        return Collections.max(list);
    }

    private static double getMin(List<Double> list) {
        return Collections.min(list);
    }

    private static double getMean(List<Double> list) {
        if (list.isEmpty()) return 0;
        double sum = 0;
        for (double d : list) sum += d;
        return sum / list.size();
    }

    private static double getSum(List<Double> list) {
        double sum = 0;
        for (double d : list) sum += d;
        return sum;
    }

    private static double getMode(List<Double> list) {
        if (list.isEmpty()) return 0;
        Map<Double, Integer> counts = new HashMap<>();
        for (Double d : list) counts.put(d, counts.getOrDefault(d, 0) + 1);
        double mode = list.get(0);
        int max = 0;
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    private static String formatNum(double d) {
        if (d == (long) d) {
            return String.valueOf((long) d);
        } else {
            return String.valueOf(d);
        }
    }
}
