package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import defpackage.KW1;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.XO0;
import defpackage.Y0;
import io.sentry.ILogger;
import io.sentry.android.replay.util.g;
import io.sentry.android.replay.util.k;
import io.sentry.android.replay.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class a {

    @NotNull
    public static final KW1 a = XO0.b(C0389a.d);
    public static boolean b;

    @Nullable
    public static WeakReference<LayoutCoordinates> c;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    public static final class C0389a extends ML0 implements Function0<Method> {
        public static final C0389a d = new C0389a(0);

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static b a(LayoutNode layoutNode, b bVar, boolean z, Y0 y0, ILogger iLogger) {
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z) {
            c = new WeakReference<>(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference<LayoutCoordinates> weakReference = c;
        Rect rectA = g.a(coordinates, weakReference != null ? weakReference.get() : null);
        boolean z2 = false;
        try {
            SemanticsConfiguration semanticsConfigurationD = d(layoutNode);
            boolean z3 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (semanticsConfigurationD == null || !semanticsConfigurationD.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectA.height() > 0 && rectA.width() > 0;
            boolean z4 = (semanticsConfigurationD != null && semanticsConfigurationD.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationD != null && semanticsConfigurationD.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationD == null || !semanticsConfigurationD.contains(SemanticsProperties.INSTANCE.getText())) && !z4) {
                Painter painterB = g.b(layoutNode);
                if (painterB == null) {
                    return new b.C0390b(layoutNode.getWidth(), layoutNode.getHeight(), bVar.c, bVar, z3 && e(semanticsConfigurationD, false, y0), rectA);
                }
                boolean z5 = z3 && e(semanticsConfigurationD, true, y0);
                int width = layoutNode.getWidth();
                int height = layoutNode.getHeight();
                float f = bVar.c;
                if (z5) {
                    Intrinsics.checkNotNullParameter(painterB, "<this>");
                    String name = painterB.getClass().getName();
                    Intrinsics.checkNotNull(name);
                    if (!StringsKt.C(name, "Vector", false) && !StringsKt.C(name, "Color", false) && !StringsKt.C(name, "Brush", false)) {
                        z2 = true;
                    }
                }
                return new b.c(width, height, f, bVar, z2, rectA);
            }
            boolean z6 = z3 && e(semanticsConfigurationD, false, y0);
            ArrayList arrayList = new ArrayList();
            if (semanticsConfigurationD != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationD, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            k kVarC = g.c(layoutNode);
            Color color = kVarC.a;
            boolean z7 = kVarC.b;
            TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull(arrayList);
            Color color2 = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
            if (color2 == null || color2.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
                color = color2;
            }
            TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
            return new b.d((textLayoutResult == null || z4 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new io.sentry.android.replay.util.b(textLayoutResult, z7), color != null ? Integer.valueOf(ColorKt.toArgb-8_81llA(color.unbox-impl()) | (-16777216)) : null, 0, 0, layoutNode.getWidth(), layoutNode.getHeight(), bVar.c, bVar, z6, rectA);
        } catch (Throwable th) {
            if (!b) {
                b = true;
                iLogger.c(NG1.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            int width2 = layoutNode.getWidth();
            int height2 = layoutNode.getHeight();
            float f2 = bVar.c;
            if (!layoutNode.getOuterCoordinator$ui_release().isTransparent() && rectA.height() > 0) {
                rectA.width();
            }
            return new b.C0390b(width2, height2, f2, bVar, true, rectA);
        }
    }

    public static boolean b(@NotNull View view, @Nullable b bVar, @NotNull Y0 options, @NotNull ILogger logger) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        StringsKt.C(name, "AndroidComposeView", false);
        return false;
    }

    public static String c(boolean z, SemanticsConfiguration semanticsConfiguration) {
        if (z) {
            return "android.widget.ImageView";
        }
        if (semanticsConfiguration != null) {
            return (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) ? "android.widget.TextView" : "android.view.View";
        }
        return "android.view.View";
    }

    @Nullable
    public static final SemanticsConfiguration d(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method method = (Method) a.getValue();
        return method != null ? (SemanticsConfiguration) method.invoke(node, new Object[0]) : node.getCollapsedSemantics$ui_release();
    }

    public static boolean e(SemanticsConfiguration semanticsConfiguration, boolean z, Y0 y0) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, v.a) : null;
        if (Intrinsics.a(str, "unmask")) {
            y0.g();
            return false;
        }
        if (Intrinsics.a(str, "mask")) {
            y0.g();
            return true;
        }
        String strC = c(z, semanticsConfiguration);
        if (((CopyOnWriteArraySet) y0.b).contains(strC)) {
            return false;
        }
        return ((CopyOnWriteArraySet) y0.a).contains(strC);
    }

    public static void f(LayoutNode layoutNode, b bVar, boolean z, Y0 y0, ILogger iLogger) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            b bVarA = a(layoutNode2, bVar, z, y0, iLogger);
            if (bVarA != null) {
                arrayList.add(bVarA);
                f(layoutNode2, bVarA, false, y0, iLogger);
            }
        }
        bVar.f = arrayList;
    }
}
