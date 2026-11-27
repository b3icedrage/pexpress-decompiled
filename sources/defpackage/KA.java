package defpackage;

import android.view.Window;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KA implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ KA(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                SZ1 sz1 = (SZ1) obj;
                Intrinsics.checkNotNullParameter(sz1, "<destruct>");
                long jLongValue = sz1.a - ((Number) ((NA) obj2).a.getValue()).longValue();
                long j = 1;
                for (int i = 0; i < 3; i++) {
                    j *= (long) 10;
                }
                return new Pair(Float.valueOf((jLongValue / j) * j), Float.valueOf(sz1.b));
            case 1:
                MatchResult match = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(match, "match");
                C6650sr0.a aVar = (C6650sr0.a) obj2;
                MatchGroup matchGroupC = match.b().c(aVar.b);
                Intrinsics.checkNotNull(matchGroupC);
                String str = match.a().get(aVar.a);
                String str2 = matchGroupC.a;
                if (!C6650sr0.a.a(str) && C6650sr0.b.a(str2) && !C6650sr0.c.a(str2)) {
                    return match.getValue();
                }
                int i2 = matchGroupC.b.d - match.c().d;
                return StringsKt.P(i2, matchGroupC.a.length() + i2, match.getValue(), "[Filtered]").toString();
            default:
                Integer num = (Integer) obj;
                int i3 = ActivityC6781tV0.Q;
                Window window = ((ActivityC6781tV0) obj2).getWindow();
                Intrinsics.checkNotNull(num);
                window.setSoftInputMode(num.intValue());
                return Unit.a;
        }
    }
}
