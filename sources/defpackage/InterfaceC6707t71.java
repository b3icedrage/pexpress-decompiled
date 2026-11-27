package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6707t71 {

    /* JADX INFO: renamed from: t71$a */
    public static final class a implements InterfaceC6707t71 {

        @NotNull
        public final Object a;

        public a(@NotNull Object conflicting) {
            Intrinsics.checkNotNullParameter(conflicting, "conflicting");
            this.a = conflicting;
        }

        @Override // defpackage.InterfaceC6707t71
        @NotNull
        public final String a() {
            return "attempted to overwrite the existing value '" + this.a + '\'';
        }
    }

    /* JADX INFO: renamed from: t71$b */
    public static final class b implements InterfaceC6707t71 {

        @NotNull
        public static final b a = new b();

        @Override // defpackage.InterfaceC6707t71
        @NotNull
        public final String a() {
            return "expected an Int value";
        }
    }

    /* JADX INFO: renamed from: t71$c */
    public static final class c implements InterfaceC6707t71 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // defpackage.InterfaceC6707t71
        @NotNull
        public final String a() {
            return SK.b(new StringBuilder("expected at least "), this.a, " digits");
        }
    }

    /* JADX INFO: renamed from: t71$d */
    public static final class d implements InterfaceC6707t71 {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        @Override // defpackage.InterfaceC6707t71
        @NotNull
        public final String a() {
            return SK.b(new StringBuilder("expected at most "), this.a, " digits");
        }
    }

    /* JADX INFO: renamed from: t71$e */
    public static final class e implements InterfaceC6707t71 {

        @NotNull
        public final String a;

        public e(@NotNull String expected) {
            Intrinsics.checkNotNullParameter(expected, "expected");
            this.a = expected;
        }

        @Override // defpackage.InterfaceC6707t71
        @NotNull
        public final String a() {
            return C1039Gc0.e(new StringBuilder("expected '"), this.a, '\'');
        }
    }

    @NotNull
    String a();
}
