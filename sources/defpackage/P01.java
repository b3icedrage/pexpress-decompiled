package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P01 {

    @NotNull
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    @NotNull
    public static final C7983zB1 a(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = C4753jp1.d(cls);
        If2 if2 = new If2(classLoader);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(if2);
        if (weakReference != null) {
            C7983zB1 c7983zB1 = (C7983zB1) weakReference.get();
            if (c7983zB1 != null) {
                return c7983zB1;
            }
            concurrentHashMap.remove(if2, weakReference);
        }
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        C1705Op1 kotlinClassFinder = new C1705Op1(classLoader);
        ClassLoader classLoader2 = Unit.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
        C1705Op1 finder = new C1705Op1(classLoader2);
        C7275vp1 javaClassFinder = new C7275vp1(classLoader);
        String moduleName = "runtime module for " + classLoader;
        QO errorReporter = QO.e;
        CB1 javaSourceElementFactory = CB1.a;
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(finder, "jvmBuiltInsKotlinClassFinder");
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        C2720aS0 storageManager = new C2720aS0("DeserializationComponentsForJava.ModuleData");
        C5060lI0.a aVar = C5060lI0.a.d;
        C5060lI0 c5060lI0 = new C5060lI0(storageManager);
        C5638o21 c5638o21M = C5638o21.m("<" + moduleName + '>');
        Intrinsics.checkNotNullExpressionValue(c5638o21M, "special(...)");
        T01 moduleDescriptor = new T01(c5638o21M, storageManager, c5060lI0, 56);
        InterfaceC4185hM1 interfaceC4185hM1 = storageManager.a;
        interfaceC4185hM1.lock();
        try {
            if (c5060lI0.a != null) {
                throw new AssertionError("Built-ins module is already set: " + c5060lI0.a + " (attempting to reset to " + moduleDescriptor + ")");
            }
            c5060lI0.a = moduleDescriptor;
            interfaceC4185hM1.unlock();
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            C4640jI0 computation = new C4640jI0(moduleDescriptor, 0);
            Intrinsics.checkNotNullParameter(computation, "computation");
            c5060lI0.f = computation;
            PZ deserializedDescriptorResolver = new PZ();
            C8016zM1 singleModuleClassResolver = new C8016zM1();
            G51 notFoundClasses = new G51(storageManager, moduleDescriptor);
            If2 if3 = if2;
            InterfaceC5119lb1.a packagePartProvider = InterfaceC5119lb1.a.a;
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
            Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
            SL1.a DO_NOTHING = SL1.a;
            Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
            JE0.a EMPTY = JE0.a;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            C5027l8 c5027l8 = C5027l8.e;
            C5653o60 c5653o60 = C5653o60.d;
            C5027l8 c5027l9 = new C5027l8(storageManager, c5653o60);
            InterfaceC3792fV1.a aVar2 = InterfaceC3792fV1.a.a;
            LL ll = LL.g;
            C2820aq1 c2820aq1 = new C2820aq1(moduleDescriptor, notFoundClasses);
            XE0 javaTypeEnhancementState = XE0.c;
            Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
            C2054Tc c2054Tc = new C2054Tc(javaTypeEnhancementState);
            C1589Ne javaResolverSettings = C1589Ne.d;
            Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
            WE0 typeEnhancement = new WE0();
            Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
            PL1 pl1 = new PL1();
            ED ed = ED.j;
            InterfaceC6905u41.b.getClass();
            C7115v41 kotlinTypeChecker = InterfaceC6905u41.a.b;
            HO0 lazyJavaPackageFragmentProvider = new HO0(new KE0(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, c5027l8, c5027l9, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, ll, moduleDescriptor, c2820aq1, c2054Tc, pl1, ed, javaResolverSettings, kotlinTypeChecker, javaTypeEnhancementState, new LL(10)));
            C7793yI0 jvmMetadataVersion = C7793yI0.g;
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            C3321dE0 c3321dE0 = new C3321dE0(deserializedDescriptorResolver, kotlinClassFinder);
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            C4760js c4760js = new C4760js(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder);
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "<set-?>");
            c4760js.f = jvmMetadataVersion;
            Nm2 deserializationConfiguration = Nm2.e;
            C6372rZ deserializationComponentsForJava = new C6372rZ(storageManager, moduleDescriptor, c3321dE0, c4760js, lazyJavaPackageFragmentProvider, notFoundClasses, kotlinTypeChecker, new C5445n62(VE.c(C6363rW.a)));
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "components");
            C6163qZ c6163qZ = deserializationComponentsForJava.a;
            Intrinsics.checkNotNullParameter(c6163qZ, "<set-?>");
            deserializedDescriptorResolver.a = c6163qZ;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            C5681oE0 c5681oE0 = new C5681oE0(lazyJavaPackageFragmentProvider);
            Intrinsics.checkNotNullParameter(c5681oE0, "<set-?>");
            singleModuleClassResolver.a = c5681oE0;
            C5693oI0 additionalClassPartsProvider = c5060lI0.K();
            C5693oI0 platformDependentDeclarationFilter = c5060lI0.K();
            C5027l8 samConversionResolver = new C5027l8(storageManager, c5653o60);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(finder, "finder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
            Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
            Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
            Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
            C6532sI0 c6532sI0 = new C6532sI0(storageManager, finder, moduleDescriptor);
            C7423wZ c7423wZ = new C7423wZ(c6532sI0);
            C6661sv c6661sv = C6661sv.m;
            C0960Fc c0960Fc = new C0960Fc(moduleDescriptor, notFoundClasses, c6661sv);
            Intrinsics.checkNotNullExpressionValue(G70.c, "DO_NOTHING");
            C6163qZ c6163qZ2 = new C6163qZ(storageManager, moduleDescriptor, c7423wZ, c0960Fc, c6532sI0, WE.f(new C6242qv(storageManager, moduleDescriptor), new C4172hI0(storageManager, moduleDescriptor)), notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, c6661sv.a, kotlinTypeChecker, samConversionResolver, 262144);
            Intrinsics.checkNotNullParameter(c6163qZ2, "<set-?>");
            c6532sI0.d = c6163qZ2;
            moduleDescriptor.U0(moduleDescriptor);
            IH providerForModuleContent = new IH(WE.f(lazyJavaPackageFragmentProvider, c6532sI0), "CompositeProvider@RuntimeModuleData for " + moduleDescriptor);
            Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
            moduleDescriptor.l = providerForModuleContent;
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            C7983zB1 c7983zB2 = new C7983zB1(c6163qZ, new C5332mb1(deserializedDescriptorResolver, kotlinClassFinder));
            while (true) {
                If2 if4 = if3;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(if4, new WeakReference(c7983zB2));
                if (weakReference2 == null) {
                    return c7983zB2;
                }
                C7983zB1 c7983zB3 = (C7983zB1) weakReference2.get();
                if (c7983zB3 != null) {
                    return c7983zB3;
                }
                concurrentHashMap3.remove(if4, weakReference2);
                if3 = if4;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (Throwable th) {
            try {
                storageManager.b.a(th);
                throw null;
            } catch (Throwable th2) {
                interfaceC4185hM1.unlock();
                throw th2;
            }
        }
    }
}
