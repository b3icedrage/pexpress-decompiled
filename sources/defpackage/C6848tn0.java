package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6848tn0 implements InterfaceC6638sn0 {

    @NotNull
    public final L41 a;

    @NotNull
    public final C6120qK1 b;

    @NotNull
    public final C1621Nn1 c;

    public C6848tn0(@NotNull L41 nicknameValidator) {
        Intrinsics.checkNotNullParameter(nicknameValidator, "nicknameValidator");
        this.a = nicknameValidator;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.b = c6120qK1G;
        this.c = C4466ii.e(c6120qK1G);
    }

    @Override // defpackage.InterfaceC6638sn0
    @Nullable
    public final Object a(@NotNull String text, @NotNull C0824Di1 c0824Di1) throws Throwable {
        this.a.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        C6120qK1 c6120qK1 = this.b;
        if (length > 15) {
            Object objA = c6120qK1.a(new J41.a(EnumC6804tc0.BadLength), c0824Di1);
            return objA == MN.d ? objA : Unit.a;
        }
        Intrinsics.checkNotNullParameter(text, "text");
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != ' ' && cCharAt != '_' && cCharAt != '.') {
                Object objA2 = c6120qK1.a(new J41.a(EnumC6804tc0.WrongChar), c0824Di1);
                return objA2 == MN.d ? objA2 : Unit.a;
            }
        }
        Intrinsics.checkNotNullParameter(text, "text");
        if (!d.o(text, " ", false) && !d.o(text, ".", false) && !d.o(text, "_", false)) {
            List other = WE.f(' ', '_', Character.valueOf(JwtParser.SEPARATOR_CHAR));
            C8017zN transform = new C8017zN(1);
            Intrinsics.checkNotNullParameter(other, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transformer");
            Intrinsics.checkNotNullParameter(other, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(transform, "transform");
            ArrayList arrayList = new ArrayList();
            for (Object obj : other) {
                ArrayList arrayList2 = new ArrayList(XE.m(other, 10));
                Iterator it = other.iterator();
                while (it.hasNext()) {
                    arrayList2.add(transform.invoke(obj, it.next()));
                }
                C2904bF.o(arrayList, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(XE.m(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Boolean.valueOf(StringsKt.C(text, (String) it2.next(), false)));
            }
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((Boolean) it3.next()).booleanValue()) {
                    }
                }
            }
            Object objA3 = c6120qK1.a(new J41.b(text), c0824Di1);
            return objA3 == MN.d ? objA3 : Unit.a;
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC6638sn0
    @NotNull
    public final C1621Nn1 b() {
        return this.c;
    }
}
