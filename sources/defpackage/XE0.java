package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class XE0 {

    @NotNull
    public static final XE0 c;

    @NotNull
    public final C2914bI0 a;
    public final boolean b;

    public /* synthetic */ class a extends C2574Zj0 implements Function1<C1758Ph0, EnumC2599Zr1> {
        public static final a m = new a(1);

        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.functions.Function1
        public final EnumC2599Zr1 invoke(C1758Ph0 c1758Ph0) {
            C1758Ph0 fqName = c1758Ph0;
            Intrinsics.checkNotNullParameter(fqName, "p0");
            C1758Ph0 c1758Ph1 = DE0.a;
            Intrinsics.checkNotNullParameter(fqName, "annotationFqName");
            InterfaceC4605j71.a.getClass();
            C5025l71 configuredReportLevels = InterfaceC4605j71.a.b;
            C6751tL0 other = new C6751tL0(1, 7, 20);
            Intrinsics.checkNotNullParameter(fqName, "annotation");
            Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
            Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
            configuredReportLevels.getClass();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            EnumC2599Zr1 enumC2599Zr1 = (EnumC2599Zr1) configuredReportLevels.c.invoke(fqName);
            if (enumC2599Zr1 != null) {
                return enumC2599Zr1;
            }
            C5025l71 c5025l71 = DE0.c;
            c5025l71.getClass();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            EE0 ee0 = (EE0) c5025l71.c.invoke(fqName);
            if (ee0 == null) {
                return EnumC2599Zr1.IGNORE;
            }
            C6751tL0 c6751tL0 = ee0.b;
            if (c6751tL0 != null) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (c6751tL0.h - other.h <= 0) {
                    return ee0.c;
                }
            }
            return ee0.a;
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.c(DE0.class, "compiler.common.jvm");
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    static {
        EnumC2599Zr1 globalReportLevel;
        C1758Ph0 c1758Ph0 = DE0.a;
        C6751tL0 other = C6751tL0.j;
        Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
        EE0 ee0 = DE0.d;
        C6751tL0 c6751tL0 = ee0.b;
        if (c6751tL0 != null) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (c6751tL0.h - other.h <= 0) {
                globalReportLevel = ee0.c;
            } else {
                globalReportLevel = ee0.a;
            }
        } else {
            globalReportLevel = ee0.a;
        }
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        C2914bI0 c2914bI0 = new C2914bI0(globalReportLevel, globalReportLevel == EnumC2599Zr1.WARN ? null : globalReportLevel);
        a aVar = a.m;
        c = new XE0(c2914bI0);
    }

    public XE0(@NotNull C2914bI0 jsr305) {
        a getReportLevelForAnnotation = a.m;
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.a = jsr305;
        this.b = jsr305.d || getReportLevelForAnnotation.invoke(DE0.a) == EnumC2599Zr1.IGNORE;
    }

    @NotNull
    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + a.m + ')';
    }
}
