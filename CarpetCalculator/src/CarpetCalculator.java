
	public  class CarpetCalculator implements CarpetCalculatable {

		private float installation_charge = 0.0f;
		private float price_per_squarefoot;
		CarpetRoomArea room = new CarpetRoomArea(0,0);

		public CarpetCalculator(float pricepersquarefoot) {
			this.price_per_squarefoot = pricepersquarefoot;
		}

		public CarpetCalculator(float pricepersquarefoot, float installationcharge) {
			this.price_per_squarefoot = pricepersquarefoot;
			this.installation_charge = installationcharge;
		}

		@Override
		public void addRoom(CarpetRoomArea ro_om) {
//			System.out.println(ro_om.getLength());
//			System.out.println(ro_om.getWidth());
			this.room.setLength(ro_om.getLength());
			this.room.setWidth(ro_om.getWidth());
		}

		@Override
		public String getTotalCost() {
			return String.format("%.1f", (room.getLength() * room.getWidth() * price_per_squarefoot) + installation_charge);
		}

		public String getTotalCost(CarpetRoomArea rm) {
			return String.format("%.1f", (rm.getLength() * rm.getWidth() * price_per_squarefoot) + installation_charge);
		}

		public String getTotalCost(CarpetRoomArea rm, float percentDiscount) {
			return String.format("%.1f", ((rm.getLength() * rm.getWidth() * price_per_squarefoot) + installation_charge)*(1 - (percentDiscount/100)));
		}

		@Override
		public void addPercentDiscount(float percentDiscount) {
			// first find the total cost = length * width * price_per_squarefoot + installation cost
		}

	}

