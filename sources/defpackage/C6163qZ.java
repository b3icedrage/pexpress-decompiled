package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6163qZ {

    @NotNull
    public final C2720aS0 a;

    @NotNull
    public final S01 b;

    @NotNull
    public final Nm2 c;

    @NotNull
    public final CC d;

    @NotNull
    public final InterfaceC0882Ec<InterfaceC1583Nc, CK<?>> e;

    @NotNull
    public final InterfaceC2973bb1 f;

    @NotNull
    public final LL g;

    @NotNull
    public final G70 h;

    @NotNull
    public final LL i;

    @NotNull
    public final InterfaceC2403Xe0 j;

    @NotNull
    public final Iterable<HC> k;

    @NotNull
    public final G51 l;

    @NotNull
    public final MM.a m;

    @NotNull
    public final InterfaceC5240m8 n;

    @NotNull
    public final InterfaceC4033ge1 o;

    @NotNull
    public final C1578Na0 p;

    @NotNull
    public final InterfaceC6905u41 q;

    @NotNull
    public final List<InterfaceC5235m62> r;

    @NotNull
    public final InterfaceC4604j70 s;

    @NotNull
    public final KC t;

    public C6163qZ(@NotNull C2720aS0 storageManager, @NotNull S01 moduleDescriptor, @NotNull CC classDataFinder, @NotNull InterfaceC0882Ec annotationAndConstantLoader, @NotNull InterfaceC2973bb1 packageFragmentProvider, @NotNull G70 errorReporter, @NotNull InterfaceC2403Xe0 flexibleTypeDeserializer, @NotNull Iterable fictitiousClassDescriptorFactories, @NotNull G51 notFoundClasses, @NotNull InterfaceC5240m8 additionalClassPartsProvider, @NotNull InterfaceC4033ge1 platformDependentDeclarationFilter, @NotNull C1578Na0 extensionRegistryLite, @NotNull InterfaceC6905u41 kotlinTypeChecker, @NotNull C5027l8 samConversionResolver, @NotNull List typeAttributeTranslators, @NotNull InterfaceC4604j70 enumEntriesDeserializationSupport) {
        Nm2 configuration = Nm2.e;
        LL localClassifierTypeSettings = LL.e;
        LL lookupTracker = LL.g;
        MM.a contractDeserializer = MM.a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.a = storageManager;
        this.b = moduleDescriptor;
        this.c = configuration;
        this.d = classDataFinder;
        this.e = annotationAndConstantLoader;
        this.f = packageFragmentProvider;
        this.g = localClassifierTypeSettings;
        this.h = errorReporter;
        this.i = lookupTracker;
        this.j = flexibleTypeDeserializer;
        this.k = fictitiousClassDescriptorFactories;
        this.l = notFoundClasses;
        this.m = contractDeserializer;
        this.n = additionalClassPartsProvider;
        this.o = platformDependentDeclarationFilter;
        this.p = extensionRegistryLite;
        this.q = kotlinTypeChecker;
        this.r = typeAttributeTranslators;
        this.s = enumEntriesDeserializationSupport;
        this.t = new KC(this);
    }

    @NotNull
    public final C6582sZ a(@NotNull InterfaceC2392Xa1 descriptor, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @NotNull AbstractC5393ms metadataVersion, @Nullable BI0 bi0) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new C6582sZ(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, bi0, null, C5653o60.d);
    }

    @Nullable
    public final FC b(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Set<QC> set = KC.c;
        return this.t.a(classId, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6163qZ(C2720aS0 c2720aS0, S01 s01, C7423wZ c7423wZ, C0960Fc c0960Fc, InterfaceC2973bb1 interfaceC2973bb1, Iterable iterable, G51 g51, InterfaceC5240m8 interfaceC5240m8, InterfaceC4033ge1 interfaceC4033ge1, C1578Na0 c1578Na0, C7115v41 c7115v41, C5027l8 c5027l8, int i) {
        C7115v41 c7115v42;
        G70.a aVar = G70.c;
        InterfaceC2403Xe0.a aVar2 = InterfaceC2403Xe0.a.a;
        InterfaceC4604j70 interfaceC4604j70 = C4994l.c;
        if ((i & 65536) != 0) {
            InterfaceC6905u41.b.getClass();
            c7115v42 = InterfaceC6905u41.a.b;
        } else {
            c7115v42 = c7115v41;
        }
        this(c2720aS0, s01, c7423wZ, c0960Fc, interfaceC2973bb1, aVar, aVar2, iterable, g51, interfaceC5240m8, interfaceC4033ge1, c1578Na0, c7115v42, c5027l8, VE.c(C6363rW.a), (i & 524288) != 0 ? InterfaceC4604j70.a.a : interfaceC4604j70);
    }
}
