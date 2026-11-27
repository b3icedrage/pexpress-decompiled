package defpackage;

import defpackage.AbstractC4723jh1;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5143lh1<Element, Array, Builder extends AbstractC4723jh1<Array>> extends RE<Element, Array, Builder> {

    @NotNull
    public final C4933kh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5143lh1(@NotNull RJ0<Element> primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.b = new C4933kh1(primitiveSerializer.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.RE, defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iH = h(obj);
        C4933kh1 c4933kh1 = this.b;
        GH ghC = encoder.C(c4933kh1);
        o(ghC, obj, iH);
        ghC.b(c4933kh1);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.b;
    }

    @Override // defpackage.Z, defpackage.RJ0
    public final Array d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (Array) i(decoder);
    }

    @Override // defpackage.Z
    public final Object e() {
        return k(n());
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        AbstractC4723jh1 abstractC4723jh1 = (AbstractC4723jh1) obj;
        Intrinsics.checkNotNullParameter(abstractC4723jh1, "<this>");
        return abstractC4723jh1.d();
    }

    @Override // defpackage.Z
    @NotNull
    public final Iterator<Element> g(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        AbstractC4723jh1 abstractC4723jh1 = (AbstractC4723jh1) obj;
        Intrinsics.checkNotNullParameter(abstractC4723jh1, "<this>");
        return abstractC4723jh1.a();
    }

    @Override // defpackage.RE
    public final void m(int i, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((AbstractC4723jh1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array n();

    public abstract void o(@NotNull GH gh, Array array, int i);
}
