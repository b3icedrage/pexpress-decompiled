package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CB1 {

    @NotNull
    public static final CB1 a = new CB1();

    public static final class a implements OE0 {

        @NotNull
        public final AbstractC8116zp1 b;

        public a(@NotNull AbstractC8116zp1 javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.b = javaElement;
        }

        @Override // defpackage.VN1
        @NotNull
        public final void a() {
            WN1.a NO_SOURCE_FILE = WN1.a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        }

        @Override // defpackage.OE0
        public final AbstractC8116zp1 b() {
            return this.b;
        }

        @NotNull
        public final String toString() {
            return a.class.getName() + ": " + this.b;
        }
    }

    @NotNull
    public final a a(@NotNull InterfaceC6101qE0 javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new a((AbstractC8116zp1) javaElement);
    }
}
