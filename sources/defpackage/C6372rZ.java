package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6372rZ {

    @NotNull
    public final C6163qZ a;

    public C6372rZ(@NotNull C2720aS0 storageManager, @NotNull T01 moduleDescriptor, @NotNull C3321dE0 classDataFinder, @NotNull C4760js annotationAndConstantLoader, @NotNull HO0 packageFragmentProvider, @NotNull G51 notFoundClasses, @NotNull C7115v41 kotlinTypeChecker, @NotNull C5445n62 typeAttributeTranslators) {
        InterfaceC4033ge1 interfaceC4033ge1K;
        InterfaceC5240m8 interfaceC5240m8K;
        Nm2 configuration = Nm2.e;
        QO errorReporter = QO.e;
        LL lookupTracker = LL.g;
        MM.a contractDeserializer = MM.a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        RK0 rk0 = moduleDescriptor.h;
        C5060lI0 c5060lI0 = rk0 instanceof C5060lI0 ? (C5060lI0) rk0 : null;
        C6730tE0 c6730tE0 = C6730tE0.a;
        C5653o60 c5653o60 = C5653o60.d;
        this.a = new C6163qZ(storageManager, moduleDescriptor, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, errorReporter, c6730tE0, c5653o60, notFoundClasses, (c5060lI0 == null || (interfaceC5240m8K = c5060lI0.K()) == null) ? InterfaceC5240m8.a.a : interfaceC5240m8K, (c5060lI0 == null || (interfaceC4033ge1K = c5060lI0.K()) == null) ? InterfaceC4033ge1.b.a : interfaceC4033ge1K, GI0.a, kotlinTypeChecker, new C5027l8(storageManager, c5653o60), typeAttributeTranslators.a, C4994l.c);
    }
}
