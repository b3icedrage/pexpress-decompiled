package kotlin.ranges;

import defpackage.InterfaceC6519sE;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/c;", "LsE;", "", "", "i", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntRange extends c implements InterfaceC6519sE<Integer> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final IntRange j = new IntRange(1, 0, 1);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable b() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable d() {
        return Integer.valueOf(this.e);
    }

    public final boolean e(int i) {
        return this.d <= i && i <= this.e;
    }

    @Override // kotlin.ranges.c
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        if (this.d == intRange.d) {
            return this.e == intRange.e;
        }
        return false;
    }

    @Override // kotlin.ranges.c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // kotlin.ranges.c, defpackage.InterfaceC6519sE
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // kotlin.ranges.c
    @NotNull
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
