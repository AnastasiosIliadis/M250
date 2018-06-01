Hotel aHotel = new Hotel();
aHotel.populate();
aHotel.printMap();
aHotel.printMapValue(344);
aHotel.addValue(344, "hhhh");
aHotel.deleteValue(344, "Ty Pacheco");
aHotel.deleteEntry(344);
aHotel.addMapEntry(344 , new HashSet<>(Arrays.asList("Hugh Gregory", "Ryder Howell")));
