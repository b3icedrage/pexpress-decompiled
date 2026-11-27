package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1939Rp1 {

    /* JADX INFO: renamed from: Rp1$a */
    public static class a<T> extends b<T> implements Function0<T> {
        public final Function0<T> e;
        public volatile SoftReference<Object> g;

        public a(@Nullable InterfaceC1490Lx interfaceC1490Lx, @NotNull Function0 function0) {
            if (function0 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.g = null;
            this.e = function0;
            if (interfaceC1490Lx != null) {
                this.g = new SoftReference<>(interfaceC1490Lx);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t;
            SoftReference<Object> softReference = this.g;
            Object obj = b.d;
            if (softReference != null && (t = (T) softReference.get()) != null) {
                if (t == obj) {
                    return null;
                }
                return t;
            }
            T tInvoke = this.e.invoke();
            if (tInvoke != null) {
                obj = tInvoke;
            }
            this.g = new SoftReference<>(obj);
            return tInvoke;
        }
    }

    /* JADX INFO: renamed from: Rp1$b */
    public static abstract class b<T> {
        public static final a d = new a();

        /* JADX INFO: renamed from: Rp1$b$a */
        public static class a {
        }
    }

    @NotNull
    public static a a(@Nullable InterfaceC1490Lx interfaceC1490Lx, @NotNull Function0 function0) {
        if (function0 != null) {
            return new a(interfaceC1490Lx, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }
}
