package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8109zn0 extends DN implements GW {
    @NotNull
    public A20 G(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return C4678jV.a.G(j, runnable, coroutineContext);
    }

    @NotNull
    public abstract AbstractC8109zn0 s1();

    @Override // defpackage.DN
    @NotNull
    public String toString() {
        AbstractC8109zn0 abstractC8109zn0S1;
        String str;
        RV rv = C6266r20.a;
        AbstractC8109zn0 abstractC8109zn0 = QV0.a;
        if (this == abstractC8109zn0) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC8109zn0S1 = abstractC8109zn0.s1();
            } catch (UnsupportedOperationException unused) {
                abstractC8109zn0S1 = null;
            }
            str = this == abstractC8109zn0S1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C3787fU.f(this);
    }
}
