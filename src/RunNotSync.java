
public class RunNotSync extends Thread {

	String car;
	Integer laps;
	String currentCar;
	private static Pitstop pitstop= new Pitstop();
	
	public RunNotSync(String car, Integer laps) {
		this.car = car;
		this.laps = laps;
	}
	
	@Override
	public void run() {
		this.currentCar = Thread.currentThread().getName();
		
		for(int x = 0; x < this.laps; x++) {
			System.out.println("                                               .*#%&&#/.    #                           ,*                                                                               \n"
					+ "                                                                           (               &                              #                                                                             \n"
					+ "                                                                         %                 %                                %                                                                           \n"
					+ "                                                                       %                   #                                 /                                                                          \n"
					+ "                                                                     %                     *                                   &                                                                        \n"
					+ "                                                                   (                       ,                                    #                                                                       \n"
					+ "                                                                 #                          ,                                     *                                                                     \n"
					+ "                                                               &                            *                                      &                                                                    \n"
					+ "                                                            .%((%&&&&&%#(/**,..                       ..,,***//(##%&&&&&&%%#(/,.    (                                                                   \n"
					+ "                                           ,&%*                                             ,                                                     .,/#%&&&#*.                                           \n"
					+ "                                           #                                                ,                                                                      &                                    \n"
					+ "                                           .                                                *                                       .                               ,                                   \n"
					+ "                                           .                   .                            *                                       #      #@&#((&@%                &                                   \n"
					+ "                                           .           ,%.           /(                     ,                                       & &%.              %.           &                                   \n"
					+ "                                           .         %                   #                 ,                                        %(                   ,*         &                                   \n"
					+ "                                           ,       %                      .*               #                                       &                       &        &                                   \n"
					+ "                                         ..*      /                         /              %                                      &                         #  &&&&&&%,                                 \n"
					+ "                                       &         %                          #              #                                     *                          %           %                               \n"
					+ "                                                 ,                          (               *                                    (                          #          #                                \n"
					+ "                                        &        (                          %               %                                     #                         %         &                                 \n"
					+ "                                          //////((*                        &   .....,*/#%%&&&&&&%####(((#################%%&&&#(,. #                       &%&&&&&&%(*                                  \n"
					+ "                                                  .&                     .(                                                         (.                   *,                                             \n"
					+ "                                                     &.                %.                                                             .%              .%                                                \n"
					+ "                                                        ,&%*.   ./%(                                                                       *&%%%%%/                                                     \n"
					+ "                                                                                                                                                                                                        \n"
					+ "                                                                                                                                                                         ");
			System.out.println(car + " " + "está ganhando" + " - Lap: " + x);
			Thread.currentThread();
			Thread.yield();
			this.pitstop.run(this.car);
		}
	}
}
