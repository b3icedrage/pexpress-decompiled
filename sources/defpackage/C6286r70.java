package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6286r70 extends CK<Pair<? extends QC, ? extends C5638o21>> {

    @NotNull
    public final QC b;

    @NotNull
    public final C5638o21 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6286r70(@NotNull QC enumClassId, @NotNull C5638o21 enumEntryName) {
        super(new Pair(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.b = enumClassId;
        this.c = enumEntryName;
    }

    @Override // defpackage.CK
    @NotNull
    public final AbstractC4649jL0 a(@NotNull S01 module) {
        AbstractC5706oM1 abstractC5706oM1Y;
        Intrinsics.checkNotNullParameter(module, "module");
        QC qc = this.b;
        FC fcA = C7859yd0.a(module, qc);
        if (fcA != null) {
            int i = C4432iZ.a;
            if (!C4432iZ.n(fcA, SC.g)) {
                fcA = null;
            }
            if (fcA != null && (abstractC5706oM1Y = fcA.y()) != null) {
                return abstractC5706oM1Y;
            }
        }
        return R70.c(Q70.ERROR_ENUM_TYPE, qc.toString(), this.c.d);
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.c);
        return sb.toString();
    }
}
