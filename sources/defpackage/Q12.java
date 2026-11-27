package defpackage;

import kotlin.Pair;
import kotlin.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Q12 extends a implements EN {
    public final /* synthetic */ String e;

    /* JADX WARN: Illegal instructions before constructor call */
    public Q12(String str) {
        EN.a aVar = EN.a.d;
        this.e = str;
        super(aVar);
    }

    @Override // defpackage.EN
    public final void P(@NotNull Throwable th) {
        C1910Rg c1910Rg = U0.v;
        if (c1910Rg != null) {
            c1910Rg.invoke(th, OW0.b(new Pair("phase", this.e)));
        }
    }
}
