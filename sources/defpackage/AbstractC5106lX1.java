package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5106lX1<Tag> implements InterfaceC7828yU, EH {

    @NotNull
    public final ArrayList<Tag> a = new ArrayList<>();
    public boolean b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: lX1$a */
    public static final class a<T> extends ML0 implements Function0<T> {
        public final /* synthetic */ AbstractC5106lX1<Tag> d;
        public final /* synthetic */ RJ0 e;
        public final /* synthetic */ T g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC5106lX1<Tag> abstractC5106lX1, RJ0 rj0, T t) {
            super(0);
            this.d = abstractC5106lX1;
            this.e = rj0;
            this.g = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            AbstractC5106lX1<Tag> abstractC5106lX1 = this.d;
            abstractC5106lX1.getClass();
            RJ0 deserializer = this.e;
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (T) abstractC5106lX1.d(deserializer);
        }
    }

    @Override // defpackage.InterfaceC7828yU
    public final short A() {
        return O(R());
    }

    @Override // defpackage.InterfaceC7828yU
    public final float B() {
        return K(R());
    }

    @Override // defpackage.EH
    @Nullable
    public final Object C(@NotNull C6188qf1 descriptor, int i, @NotNull RJ0 deserializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String strQ = Q(descriptor, i);
        C4896kX1 c4896kX1 = new C4896kX1(this, deserializer, obj);
        this.a.add(strQ);
        Object objInvoke = c4896kX1.invoke();
        if (!this.b) {
            R();
        }
        this.b = false;
        return objInvoke;
    }

    @Override // defpackage.EH
    public final long D(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N(Q(descriptor, i));
    }

    @Override // defpackage.InterfaceC7828yU
    public final double E() {
        return I(R());
    }

    public abstract boolean F(Tag tag);

    public abstract byte G(Tag tag);

    public abstract char H(Tag tag);

    public abstract double I(Tag tag);

    public abstract int J(Tag tag, @NotNull MH1 mh1);

    public abstract float K(Tag tag);

    @NotNull
    public abstract InterfaceC7828yU L(Tag tag, @NotNull MH1 mh1);

    public abstract int M(Tag tag);

    public abstract long N(Tag tag);

    public abstract short O(Tag tag);

    @NotNull
    public abstract String P(Tag tag);

    public abstract String Q(@NotNull MH1 mh1, int i);

    public final Tag R() {
        ArrayList<Tag> arrayList = this.a;
        Tag tagRemove = arrayList.remove(WE.e(arrayList));
        this.b = true;
        return tagRemove;
    }

    @Override // defpackage.InterfaceC7828yU
    public abstract <T> T d(@NotNull RJ0 rj0);

    @Override // defpackage.EH
    @NotNull
    public final InterfaceC7828yU e(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(Q(descriptor, i), descriptor.i(i));
    }

    @Override // defpackage.InterfaceC7828yU
    public final boolean f() {
        return F(R());
    }

    @Override // defpackage.InterfaceC7828yU
    public final char g() {
        return H(R());
    }

    @Override // defpackage.EH
    public final double i(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(Q(descriptor, i));
    }

    @Override // defpackage.EH
    public final char j(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H(Q(descriptor, i));
    }

    @Override // defpackage.EH
    public final float k(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return K(Q(descriptor, i));
    }

    @Override // defpackage.EH
    public final byte m(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return G(Q(descriptor, i));
    }

    @Override // defpackage.EH
    @NotNull
    public final String n(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(Q(descriptor, i));
    }

    @Override // defpackage.InterfaceC7828yU
    public final int o() {
        return M(R());
    }

    @Override // defpackage.EH
    public final short p(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return O(Q(descriptor, i));
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public InterfaceC7828yU q(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(R(), descriptor);
    }

    @Override // defpackage.EH
    public final <T> T r(@NotNull MH1 descriptor, int i, @NotNull RJ0 deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String strQ = Q(descriptor, i);
        a aVar = new a(this, deserializer, t);
        this.a.add(strQ);
        T t2 = (T) aVar.invoke();
        if (!this.b) {
            R();
        }
        this.b = false;
        return t2;
    }

    @Override // defpackage.EH
    public final int s(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(Q(descriptor, i));
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public final String t() {
        return P(R());
    }

    @Override // defpackage.InterfaceC7828yU
    public final int u(@NotNull MH1 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return J(R(), enumDescriptor);
    }

    @Override // defpackage.InterfaceC7828yU
    public final long v() {
        return N(R());
    }

    @Override // defpackage.EH
    public final boolean y(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return F(Q(descriptor, i));
    }

    @Override // defpackage.InterfaceC7828yU
    public final byte z() {
        return G(R());
    }
}
