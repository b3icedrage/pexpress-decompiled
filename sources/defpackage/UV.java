package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UV implements InterfaceC1249Iu0 {

    @NotNull
    public static final ThreadLocal<InterfaceC1171Hu0> a = new ThreadLocal<>();

    public static final class a implements InterfaceC1482Lu0 {

        @Nullable
        public final InterfaceC1171Hu0 d;

        public a(@Nullable InterfaceC1171Hu0 interfaceC1171Hu0) {
            this.d = interfaceC1171Hu0;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            UV.a.set(this.d);
        }
    }

    @Override // defpackage.InterfaceC1249Iu0
    public final InterfaceC1482Lu0 a(@Nullable InterfaceC1171Hu0 interfaceC1171Hu0) {
        InterfaceC1171Hu0 interfaceC1171Hu1 = get();
        a.set(interfaceC1171Hu0);
        return new a(interfaceC1171Hu1);
    }

    @Override // defpackage.InterfaceC1249Iu0
    public final void close() {
        a.remove();
    }

    @Override // defpackage.InterfaceC1249Iu0
    @Nullable
    public final InterfaceC1171Hu0 get() {
        return a.get();
    }
}
