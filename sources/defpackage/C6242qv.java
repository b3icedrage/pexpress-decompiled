package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6242qv implements HC {

    @NotNull
    public final C2720aS0 a;

    @NotNull
    public final T01 b;

    public C6242qv(@NotNull C2720aS0 storageManager, @NotNull T01 module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.a = storageManager;
        this.b = module;
    }

    @Override // defpackage.HC
    @Nullable
    public final FC a(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.c) {
            return null;
        }
        C1758Ph0 c1758Ph0 = classId.b;
        if (!c1758Ph0.e().d()) {
            return null;
        }
        String strB = c1758Ph0.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        if (!StringsKt.C(strB, "Function", false)) {
            return null;
        }
        C3217ck0 c3217ck0 = C3217ck0.c;
        C1758Ph0 c1758Ph1 = classId.a;
        C3217ck0.a aVarA = c3217ck0.a(c1758Ph1, strB);
        if (aVarA == null) {
            return null;
        }
        List<InterfaceC2392Xa1> listO = this.b.A0(c1758Ph1).O();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (obj instanceof InterfaceC8132zv) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC2418Xj0) {
                arrayList2.add(obj2);
            }
        }
        InterfaceC8132zv interfaceC8132zv = (InterfaceC2418Xj0) CollectionsKt.firstOrNull(arrayList2);
        if (interfaceC8132zv == null) {
            interfaceC8132zv = (InterfaceC8132zv) CollectionsKt.F(arrayList);
        }
        return new C1842Qj0(this.a, interfaceC8132zv, aVarA.a, aVarA.b);
    }

    @Override // defpackage.HC
    @NotNull
    public final Collection<FC> b(@NotNull C1758Ph0 packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return C6702t60.d;
    }

    @Override // defpackage.HC
    public final boolean c(@NotNull C1758Ph0 packageFqName, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String strE = name.e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        return (d.o(strE, "Function", false) || d.o(strE, "KFunction", false) || d.o(strE, "SuspendFunction", false) || d.o(strE, "KSuspendFunction", false)) && C3217ck0.c.a(packageFqName, strE) != null;
    }
}
