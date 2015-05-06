# This script was run in the minerful folder
java -cp MINERful.jar minerful.MinerFulTracesMakerStarter -a A:B:C:D:E:F:G:H:I:J:K:L:M:N:O:P:Q:R:S:T -d none -m 30 -M 30 -s 1000 -oE "xes" -oLF "C:\Users\Administrator\dev\logs\logt1000len30a20.xes" -r "[^C]*([AB][C][^C]*)*[^C]*" "[^A]*([A][^A]*[BC][^A]*)*[^A]*" "[^A]*(([A].*[BCDE].*)|([BCDE].*[A].*))*[^A]*" "[^A]*([A].*[BC])*[^A]*" "[^E]*([ABCD].*[E])*[^E]*"

# Some leftover script bits
#java -cp MINERful.jar minerful.MinerFulTracesMakerStarter -a A:B:C:D:E -d none -m 1 -M 10 -s 100 -oE "xes" -oLF ""C:\Users\Administrator\dev\logs\examplelog.xes" -r "[^C]*([AB][C][^C]*)*[^C]*" "[^A]*([A][^A]*[BC][^A]*)*[^A]*" "[^A]*(([A].*[BCDE].*)|([BCDE].*[A].*))*[^A]*" "[^A]*([A].*[BC])*[^A]*" "[^E]*([ABCD].*[E])*[^E]*"
#A:B:C:D:E:F:G:H:I:J:K:L:M:N:O:P:Q:R:S:T
#A:B:C:D:E:F:G:H:I:J:K:L:M:N:O:P:Q:R:S:T:A1:B1:C1:D1:E1:F1:G1:H1:I1:J1