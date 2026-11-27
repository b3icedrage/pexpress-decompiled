package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: uP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6973uP0 {

    /* JADX INFO: renamed from: uP0$a */
    public interface a<T> {
        String a(Context context);
    }

    public static UG<?> a(String str, String str2) {
        C8111zo c8111zo = new C8111zo(str, str2);
        UG.a aVarA = UG.a(AbstractC6553sP0.class);
        aVarA.e = 1;
        aVarA.f = new TG(c8111zo);
        return aVarA.b();
    }

    public static UG<?> b(String str, a<Context> aVar) {
        UG.a aVarA = UG.a(AbstractC6553sP0.class);
        aVarA.e = 1;
        aVarA.a(C6996uX.b(Context.class));
        aVarA.f = new C6763tP0(str, aVar);
        return aVarA.b();
    }
}
