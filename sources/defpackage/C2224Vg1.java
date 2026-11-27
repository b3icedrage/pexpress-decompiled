package defpackage;

import io.sentry.android.core.b0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Vg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2224Vg1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ES es, Function2 function2, JM jm) {
        C2068Tg1 c2068Tg1;
        if (jm instanceof C2068Tg1) {
            c2068Tg1 = (C2068Tg1) jm;
            int i = c2068Tg1.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2068Tg1.e = i - Integer.MIN_VALUE;
            } else {
                c2068Tg1 = new C2068Tg1(jm);
            }
        } else {
            c2068Tg1 = new C2068Tg1(jm);
        }
        Object obj = c2068Tg1.d;
        Object obj2 = MN.d;
        int i2 = c2068Tg1.e;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                C2146Ug1 c2146Ug1 = new C2146Ug1(function2, null);
                c2068Tg1.e = 1;
                if (es.a(new C1130Hg1(c2146Ug1, null), c2068Tg1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return InterfaceC4740jl2.b.a;
        } catch (Exception e) {
            b0.c("PreferencesRepository", "insert exception: " + e.getLocalizedMessage());
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            return new InterfaceC4740jl2.a(localizedMessage);
        }
    }
}
