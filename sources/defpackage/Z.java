package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z<Element, Collection, Builder> implements RJ0<Collection> {
    @Override // defpackage.RJ0
    public Collection d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (Collection) i(decoder);
    }

    public abstract Builder e();

    public abstract int f(Builder builder);

    @NotNull
    public abstract Iterator<Element> g(Collection collection);

    public abstract int h(Collection collection);

    public final Object i(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Builder builderE = e();
        int iF = f(builderE);
        EH ehC = decoder.c(c());
        while (true) {
            int iH = ehC.h(c());
            if (iH == -1) {
                ehC.b(c());
                return l(builderE);
            }
            j(ehC, iH + iF, builderE);
        }
    }

    public abstract void j(@NotNull EH eh, int i, Object obj);

    public abstract Builder k(Collection collection);

    public abstract Collection l(Builder builder);
}
