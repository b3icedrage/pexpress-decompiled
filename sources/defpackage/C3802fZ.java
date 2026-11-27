package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3802fZ implements InterfaceC3383dZ {
    public static final /* synthetic */ IJ0<Object>[] Y;

    @NotNull
    public final C3592eZ A;

    @NotNull
    public final C3592eZ B;

    @NotNull
    public final C3592eZ C;

    @NotNull
    public final C3592eZ D;

    @NotNull
    public final C3592eZ E;

    @NotNull
    public final C3592eZ F;

    @NotNull
    public final C3592eZ G;

    @NotNull
    public final C3592eZ H;

    @NotNull
    public final C3592eZ I;

    @NotNull
    public final C3592eZ J;

    @NotNull
    public final C3592eZ K;

    @NotNull
    public final C3592eZ L;

    @NotNull
    public final C3592eZ M;

    @NotNull
    public final C3592eZ N;

    @NotNull
    public final C3592eZ O;

    @NotNull
    public final C3592eZ P;

    @NotNull
    public final C3592eZ Q;

    @NotNull
    public final C3592eZ R;

    @NotNull
    public final C3592eZ S;

    @NotNull
    public final C3592eZ T;

    @NotNull
    public final C3592eZ U;

    @NotNull
    public final C3592eZ V;

    @NotNull
    public final C3592eZ W;

    @NotNull
    public final C3592eZ X;
    public boolean a;

    @NotNull
    public final C3592eZ b = new C3592eZ(InterfaceC5467nD.c.a, this);

    @NotNull
    public final C3592eZ c;

    @NotNull
    public final C3592eZ d;

    @NotNull
    public final C3592eZ e;

    @NotNull
    public final C3592eZ f;

    @NotNull
    public final C3592eZ g;

    @NotNull
    public final C3592eZ h;

    @NotNull
    public final C3592eZ i;

    @NotNull
    public final C3592eZ j;

    @NotNull
    public final C3592eZ k;

    @NotNull
    public final C3592eZ l;

    @NotNull
    public final C3592eZ m;

    @NotNull
    public final C3592eZ n;

    @NotNull
    public final C3592eZ o;

    @NotNull
    public final C3592eZ p;

    @NotNull
    public final C3592eZ q;

    @NotNull
    public final C3592eZ r;

    @NotNull
    public final C3592eZ s;

    @NotNull
    public final C3592eZ t;

    @NotNull
    public final C3592eZ u;

    @NotNull
    public final C3592eZ v;

    @NotNull
    public final C3592eZ w;

    @NotNull
    public final C3592eZ x;

    @NotNull
    public final C3592eZ y;

    @NotNull
    public final C3592eZ z;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        Y = new IJ0[]{c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "withDefinedIn", "getWithDefinedIn()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "modifiers", "getModifiers()Ljava/util/Set;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "startFromName", "getStartFromName()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "debugMode", "getDebugMode()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "verbose", "getVerbose()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "unitReturnType", "getUnitReturnType()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "withoutReturnType", "getWithoutReturnType()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "enhancedTypes", "getEnhancedTypes()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderDefaultModality", "getRenderDefaultModality()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "receiverAfterName", "getReceiverAfterName()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), c2251Vp1.e(new C3068c21(c2251Vp1.b(C3802fZ.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public C3802fZ() {
        Boolean bool = Boolean.TRUE;
        this.c = new C3592eZ(bool, this);
        this.d = new C3592eZ(bool, this);
        this.e = new C3592eZ(EnumC3173cZ.e, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new C3592eZ(bool2, this);
        this.g = new C3592eZ(bool2, this);
        this.h = new C3592eZ(bool2, this);
        this.i = new C3592eZ(bool2, this);
        this.j = new C3592eZ(bool2, this);
        this.k = new C3592eZ(bool, this);
        this.l = new C3592eZ(bool2, this);
        this.m = new C3592eZ(bool2, this);
        this.n = new C3592eZ(bool2, this);
        this.o = new C3592eZ(bool, this);
        this.p = new C3592eZ(bool, this);
        this.q = new C3592eZ(bool2, this);
        this.r = new C3592eZ(bool2, this);
        this.s = new C3592eZ(bool2, this);
        this.t = new C3592eZ(bool2, this);
        this.u = new C3592eZ(bool2, this);
        this.v = new C3592eZ(null, this);
        this.w = new C3592eZ(bool2, this);
        this.x = new C3592eZ(bool2, this);
        this.y = new C3592eZ(C1428Lc.h, this);
        this.z = new C3592eZ(C7928yx.g, this);
        this.A = new C3592eZ(bool, this);
        this.B = new C3592eZ(EnumC1268Ja1.e, this);
        this.C = new C3592eZ(XY.b.a.a, this);
        this.D = new C3592eZ(EnumC1397Kr1.d, this);
        this.E = new C3592eZ(EnumC1897Rb1.d, this);
        this.F = new C3592eZ(bool2, this);
        this.G = new C3592eZ(bool2, this);
        this.H = new C3592eZ(EnumC7464wj1.d, this);
        this.I = new C3592eZ(bool2, this);
        this.J = new C3592eZ(bool2, this);
        this.K = new C3592eZ(C6702t60.d, this);
        this.L = new C3592eZ(O90.a, this);
        this.M = new C3592eZ(null, this);
        this.N = new C3592eZ(EnumC1038Gc.NO_ARGUMENTS, this);
        this.O = new C3592eZ(bool2, this);
        this.P = new C3592eZ(bool, this);
        this.Q = new C3592eZ(bool, this);
        this.R = new C3592eZ(bool2, this);
        this.S = new C3592eZ(bool2, this);
        this.T = new C3592eZ(bool, this);
        this.U = new C3592eZ(bool, this);
        new C3592eZ(bool2, this);
        this.V = new C3592eZ(bool2, this);
        this.W = new C3592eZ(bool2, this);
        this.X = new C3592eZ(bool, this);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void a() {
        this.F.c(Y[30], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void b() {
        this.h.c(Y[6], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void c() {
        this.G.c(Y[31], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void d(@NotNull Set<? extends EnumC3173cZ> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.e.c(Y[3], set);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void e(@NotNull LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.L.c(Y[36], linkedHashSet);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void f() {
        this.w.c(Y[21], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void g(@NotNull InterfaceC5467nD interfaceC5467nD) {
        Intrinsics.checkNotNullParameter(interfaceC5467nD, "<set-?>");
        this.b.c(Y[0], interfaceC5467nD);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void h(@NotNull EnumC1897Rb1 enumC1897Rb1) {
        Intrinsics.checkNotNullParameter(enumC1897Rb1, "<set-?>");
        this.E.c(Y[29], enumC1897Rb1);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void i() {
        this.f.c(Y[4], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void j() {
        this.c.c(Y[1], Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC3383dZ
    @NotNull
    public final Set<C1758Ph0> k() {
        return (Set) this.L.b(Y[36], this);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void l() {
        EnumC1397Kr1.a aVar = EnumC1397Kr1.e;
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.D.c(Y[28], aVar);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void m() {
        this.x.c(Y[22], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.h.b(Y[6], this)).booleanValue();
    }
}
