package defpackage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0942Ew {

    @NotNull
    public static final a a = a.a;

    /* JADX INFO: renamed from: Ew$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public static final KW1 b = XO0.b(C0027a.d);

        /* JADX INFO: renamed from: Ew$a$a, reason: collision with other inner class name */
        public static final class C0027a extends ML0 implements Function0<InterfaceC6245qw> {
            public static final C0027a d = new C0027a(0);

            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC6245qw invoke() {
                C2836aw c2836aw = new C2836aw(false, P71.c, 8);
                C4994l.b(c2836aw);
                return c2836aw;
            }
        }
    }

    @Nullable
    Throwable b();

    int d();

    @Nullable
    Object e(@NotNull C2895bC c2895bC, @NotNull LM lm);

    @Nullable
    Object f(long j, @NotNull LM lm);

    boolean i(@Nullable Throwable th);

    @Nullable
    Object j(@NotNull byte[] bArr, int i, int i2, @NotNull LM lm);

    boolean k();
}
