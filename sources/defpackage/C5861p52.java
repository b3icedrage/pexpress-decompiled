package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5861p52<A, B, C> implements RJ0<C5651o52<? extends A, ? extends B, ? extends C>> {

    @NotNull
    public final RJ0<A> a;

    @NotNull
    public final RJ0<B> b;

    @NotNull
    public final RJ0<C> c;

    @NotNull
    public final OH1 d;

    /* JADX INFO: renamed from: p52$a */
    public static final class a extends ML0 implements Function1<YC, Unit> {
        public final /* synthetic */ C5861p52<A, B, C> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5861p52<A, B, C> c5861p52) {
            super(1);
            this.d = c5861p52;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(YC yc) {
            YC buildClassSerialDescriptor = yc;
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            C5861p52<A, B, C> c5861p52 = this.d;
            YC.a(buildClassSerialDescriptor, "first", c5861p52.a.c());
            YC.a(buildClassSerialDescriptor, "second", c5861p52.b.c());
            YC.a(buildClassSerialDescriptor, "third", c5861p52.c.c());
            return Unit.a;
        }
    }

    public C5861p52(@NotNull RJ0<A> aSerializer, @NotNull RJ0<B> bSerializer, @NotNull RJ0<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.a = aSerializer;
        this.b = bSerializer;
        this.c = cSerializer;
        this.d = SH1.b("kotlin.Triple", new MH1[0], new a(this));
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        C5651o52 value = (C5651o52) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        OH1 oh1 = this.d;
        GH ghC = encoder.c(oh1);
        ghC.n(oh1, 0, this.a, value.d);
        ghC.n(oh1, 1, this.b, value.e);
        ghC.n(oh1, 2, this.c, value.g);
        ghC.b(oh1);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.d;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        OH1 oh1 = this.d;
        EH ehC = decoder.c(oh1);
        Object obj = C4019gb.d;
        Object objR = obj;
        Object objR2 = objR;
        Object objR3 = objR2;
        while (true) {
            int iH = ehC.h(oh1);
            if (iH == -1) {
                ehC.b(oh1);
                if (objR == obj) {
                    throw new ZH1("Element 'first' is missing");
                }
                if (objR2 == obj) {
                    throw new ZH1("Element 'second' is missing");
                }
                if (objR3 != obj) {
                    return new C5651o52(objR, objR2, objR3);
                }
                throw new ZH1("Element 'third' is missing");
            }
            if (iH == 0) {
                objR = ehC.r(oh1, 0, this.a, null);
            } else if (iH == 1) {
                objR2 = ehC.r(oh1, 1, this.b, null);
            } else {
                if (iH != 2) {
                    throw new ZH1(EK.e(iH, "Unexpected index "));
                }
                objR3 = ehC.r(oh1, 2, this.c, null);
            }
        }
    }
}
