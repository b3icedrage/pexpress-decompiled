package kotlin.reflect;

import defpackage.C6489s51;
import defpackage.EnumC2920bK0;
import defpackage.R51;
import defpackage.SJ0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final KTypeProjection d = new KTypeProjection(null, null);

    @Nullable
    public final EnumC2920bK0 a;

    @Nullable
    public final SJ0 b;

    /* JADX INFO: renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2920bK0.values().length];
            try {
                EnumC2920bK0 enumC2920bK0 = EnumC2920bK0.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC2920bK0 enumC2920bK1 = EnumC2920bK0.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC2920bK0 enumC2920bK2 = EnumC2920bK0.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public KTypeProjection(@Nullable EnumC2920bK0 enumC2920bK0, @Nullable SJ0 sj0) {
        String str;
        this.a = enumC2920bK0;
        this.b = sj0;
        if ((enumC2920bK0 == null) == (sj0 == null)) {
            return;
        }
        if (enumC2920bK0 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC2920bK0 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.a == kTypeProjection.a && Intrinsics.a(this.b, kTypeProjection.b);
    }

    public final int hashCode() {
        EnumC2920bK0 enumC2920bK0 = this.a;
        int iHashCode = (enumC2920bK0 == null ? 0 : enumC2920bK0.hashCode()) * 31;
        SJ0 sj0 = this.b;
        return iHashCode + (sj0 != null ? sj0.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        EnumC2920bK0 enumC2920bK0 = this.a;
        int i = enumC2920bK0 == null ? -1 : b.a[enumC2920bK0.ordinal()];
        if (i == -1) {
            return "*";
        }
        SJ0 sj0 = this.b;
        if (i == 1) {
            return String.valueOf(sj0);
        }
        if (i == 2) {
            return "in " + sj0;
        }
        if (i != 3) {
            throw new C6489s51();
        }
        return "out " + sj0;
    }
}
