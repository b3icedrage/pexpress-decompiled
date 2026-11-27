package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8078zf1<T> extends T0<T> {

    @NotNull
    public final RI0<T> a;

    @NotNull
    public final C5653o60 b;

    @NotNull
    public final Object c;

    /* JADX INFO: renamed from: zf1$a */
    public static final class a extends ML0 implements Function0<MH1> {
        public final /* synthetic */ C8078zf1<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8078zf1<T> c8078zf1) {
            super(0);
            this.d = c8078zf1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MH1 invoke() {
            C8078zf1<T> c8078zf1 = this.d;
            OH1 oh1C = SH1.c("kotlinx.serialization.Polymorphic", AbstractC7448wf1.a.a, new MH1[0], new C7868yf1(c8078zf1));
            RI0<T> context = c8078zf1.a;
            Intrinsics.checkNotNullParameter(oh1C, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            return new C6543sM(oh1C, context);
        }
    }

    public C8078zf1(@NotNull RI0<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.a = baseClass;
        this.b = C5653o60.d;
        this.c = XO0.a(EnumC4403iP0.d, new a(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return (MH1) this.c.getValue();
    }

    @Override // defpackage.T0
    @NotNull
    public final RI0<T> e() {
        return this.a;
    }

    @NotNull
    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
