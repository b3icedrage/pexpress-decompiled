package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914bI0 {

    @NotNull
    public final EnumC2599Zr1 a;

    @Nullable
    public final EnumC2599Zr1 b;

    @NotNull
    public final C5863p60 c;
    public final boolean d;

    public C2914bI0() {
        throw null;
    }

    public C2914bI0(EnumC2599Zr1 globalLevel, EnumC2599Zr1 enumC2599Zr1) {
        C5863p60 userDefinedLevelForSpecificAnnotation = PW0.c();
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.a = globalLevel;
        this.b = enumC2599Zr1;
        this.c = userDefinedLevelForSpecificAnnotation;
        XO0.b(new C2690aI0(this, 0));
        EnumC2599Zr1 enumC2599Zr2 = EnumC2599Zr1.IGNORE;
        this.d = globalLevel == enumC2599Zr2 && enumC2599Zr1 == enumC2599Zr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2914bI0)) {
            return false;
        }
        C2914bI0 c2914bI0 = (C2914bI0) obj;
        return this.a == c2914bI0.a && this.b == c2914bI0.b && Intrinsics.a(this.c, c2914bI0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EnumC2599Zr1 enumC2599Zr1 = this.b;
        int iHashCode2 = (iHashCode + (enumC2599Zr1 == null ? 0 : enumC2599Zr1.hashCode())) * 31;
        this.c.getClass();
        return iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
