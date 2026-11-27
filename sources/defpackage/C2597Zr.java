package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2597Zr {

    @NotNull
    public final List<EnumC2519Yr> a;

    @NotNull
    public final ArrayList b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2597Zr(@NotNull List<? extends EnumC2519Yr> templateList) {
        Intrinsics.checkNotNullParameter(templateList, "templateList");
        this.a = templateList;
        this.b = new ArrayList();
    }

    public final void a(@NotNull EnumC2519Yr betResult) {
        Intrinsics.checkNotNullParameter(betResult, "betResult");
        ArrayList arrayList = this.b;
        arrayList.add(betResult);
        while (arrayList.size() > this.a.size()) {
            arrayList.remove(0);
        }
    }
}
