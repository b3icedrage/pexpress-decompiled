package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7922yv implements InterfaceC7502wv {

    @NotNull
    public final C0783Cv b = new C0783Cv();

    @Override // defpackage.InterfaceC7502wv
    @NotNull
    public final C2749ab1 a(@NotNull C2720aS0 storageManager, @NotNull S01 module, @NotNull Iterable classDescriptorFactories, @NotNull InterfaceC4033ge1 platformDependentDeclarationFilter, @NotNull InterfaceC5240m8 additionalClassPartsProvider, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<C1758Ph0> packageFqNames = C4194hP1.q;
        C7712xv loadResource = new C7712xv(1, this.b);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList(XE.m(packageFqNames, 10));
        for (C1758Ph0 c1758Ph0 : packageFqNames) {
            C6661sv.m.getClass();
            String strA = C6661sv.a(c1758Ph0);
            InputStream inputStream = (InputStream) loadResource.invoke(strA);
            if (inputStream == null) {
                throw new IllegalStateException(C5491nL.c("Resource not found in classpath: ", strA));
            }
            arrayList.add(C0627Av.a.a(c1758Ph0, storageManager, module, inputStream));
        }
        C2749ab1 c2749ab1 = new C2749ab1(arrayList);
        G51 g51 = new G51(storageManager, module);
        C7423wZ c7423wZ = new C7423wZ(c2749ab1);
        C6661sv c6661sv = C6661sv.m;
        C0960Fc c0960Fc = new C0960Fc(module, g51, c6661sv);
        G70.a DO_NOTHING = G70.c;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        C6163qZ c6163qZ = new C6163qZ(storageManager, module, c7423wZ, c0960Fc, c2749ab1, classDescriptorFactories, g51, additionalClassPartsProvider, platformDependentDeclarationFilter, c6661sv.a, null, new C5027l8(storageManager, C5653o60.d), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0627Av) it.next()).V0(c6163qZ);
        }
        return c2749ab1;
    }
}
