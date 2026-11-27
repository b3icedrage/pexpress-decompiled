package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.jivosite.sdk.model.pojo.rate.RateSettings;
import io.sentry.util.l;
import java.util.Set;

/* JADX INFO: renamed from: m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5244m9 implements InterfaceC1608Nj0, InterfaceC5056lH, l.a {
    public final /* synthetic */ int d;

    public /* synthetic */ C5244m9(int i) {
        this.d = i;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        RateSettings.b bVar;
        switch (this.d) {
            case 0:
                return (L8) obj;
            case 1:
                C6960uL.a aVar = (C6960uL.a) obj;
                return Boolean.valueOf(aVar != null && !aVar.a && aVar.b && aVar.c && aVar.d);
            case 5:
                RateSettings rateSettings = ((C1774Pm1) obj).a;
                if (rateSettings == null || (bVar = rateSettings.a) == null) {
                    return null;
                }
                return bVar.d;
            default:
                return ((C8059za2) obj).a;
        }
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return C2688aH1.empty();
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        switch (this.d) {
            case 2:
                Set setB = c1480Lt1.b(C7892yl1.a(AbstractC6553sP0.class));
                C5375mm0 c5375mm0 = C5375mm0.b;
                if (c5375mm0 == null) {
                    synchronized (C5375mm0.class) {
                        try {
                            c5375mm0 = C5375mm0.b;
                            if (c5375mm0 == null) {
                                c5375mm0 = new C5375mm0();
                                C5375mm0.b = c5375mm0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new C6573sW(setB, c5375mm0);
            case 3:
                return ExecutorsRegistrar.c.get();
            default:
                return TransportRegistrar.lambda$getComponents$0(c1480Lt1);
        }
    }
}
