package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: pG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5897pG0<T> {

    /* JADX INFO: renamed from: pG0$a */
    public interface a {
        @CheckReturnValue
        @Nullable
        AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11);
    }

    @CheckReturnValue
    @Nullable
    public abstract T a(AbstractC8000zH0 abstractC8000zH0);

    @CheckReturnValue
    @Nullable
    public final T b(String str) {
        C1481Lu c1481Lu = new C1481Lu();
        c1481Lu.w1(str);
        SH0 sh0 = new SH0(c1481Lu);
        T tA = a(sh0);
        if ((this instanceof C5687oG0) || sh0.k() == AbstractC8000zH0.b.n) {
            return tA;
        }
        throw new EG0("JSON document was not fully consumed.");
    }

    @CheckReturnValue
    public final C4137h71 c() {
        return this instanceof C4137h71 ? (C4137h71) this : new C4137h71(this);
    }

    @CheckReturnValue
    public final String d(@Nullable T t) {
        C1481Lu c1481Lu = new C1481Lu();
        try {
            e(new UH0(c1481Lu), t);
            return c1481Lu.Q0();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void e(YH0 yh0, @Nullable T t);
}
