package defpackage;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4814k70<T extends Enum<T>> extends AbstractC5838p0<T> implements InterfaceC4346i70<T>, Serializable {

    @NotNull
    public final T[] e;

    public C4814k70(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.e = entries;
    }

    @Override // defpackage.Y
    public final int b() {
        return this.e.length;
    }

    @Override // defpackage.Y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) C1526Mj.t(this.e, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        T[] tArr = this.e;
        int length = tArr.length;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i, length);
        return tArr[i];
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C1526Mj.t(this.e, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
