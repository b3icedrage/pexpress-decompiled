package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZC extends W {
    public final O01 c;
    public final List<H62> d;
    public final Collection<AbstractC4649jL0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZC(@NotNull O01 o01, @NotNull List list, @NotNull Collection collection, @NotNull C2720aS0 c2720aS0) {
        super((OQ1) c2720aS0);
        if (list == null) {
            o(1);
            throw null;
        }
        if (collection == null) {
            o(2);
            throw null;
        }
        if (c2720aS0 == null) {
            o(3);
            throw null;
        }
        this.c = o01;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void o(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        List<H62> list = this.d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return true;
    }

    @Override // defpackage.B1
    @NotNull
    public final Collection<AbstractC4649jL0> h() {
        Collection<AbstractC4649jL0> collection = this.e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    @Override // defpackage.B1
    @NotNull
    public final InterfaceC3792fV1 k() {
        return InterfaceC3792fV1.a.a;
    }

    @Override // defpackage.W
    @NotNull
    /* JADX INFO: renamed from: p */
    public final FC c() {
        O01 o01 = this.c;
        if (o01 != null) {
            return o01;
        }
        o(5);
        throw null;
    }

    public final String toString() {
        String str = C4432iZ.g(this.c).a;
        if (str != null) {
            return str;
        }
        C1836Qh0.a(4);
        throw null;
    }
}
