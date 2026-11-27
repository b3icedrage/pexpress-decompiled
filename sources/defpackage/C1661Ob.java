package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661Ob implements InterfaceC7445we2 {

    @NotNull
    public final int[] a = new int[2];

    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    @Override // defpackage.InterfaceC7445we2
    @Nullable
    public final C6814te2 a(@NotNull View view, @NotNull Pair targetPosition) {
        Object objA;
        String string;
        CharSequence text;
        C6814te2.a targetType = C6814te2.a.d;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        String string2 = null;
        View view2 = view != null ? view : null;
        if (view2 != null) {
            float fFloatValue = ((Number) targetPosition.d).floatValue();
            float fFloatValue2 = ((Number) targetPosition.e).floatValue();
            int[] iArr = this.a;
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = view.getWidth();
            int height = view.getHeight();
            if (fFloatValue < i || fFloatValue > i + width || fFloatValue2 < i2 || fFloatValue2 > i2 + height || !view.isClickable() || view.getVisibility() != 0) {
                view2 = null;
            }
            if (view2 != null) {
                String canonicalName = view.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = view.getClass().getSimpleName();
                }
                String str = canonicalName;
                Intrinsics.checkNotNullParameter(view, "<this>");
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getId() == -1 || ((view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0)) {
                        throw new Resources.NotFoundException();
                    }
                    Resources resources = view.getContext().getResources();
                    objA = resources != null ? resources.getResourceEntryName(view.getId()) : null;
                    if (objA == null) {
                        objA = "";
                    }
                    if (C1717Ot1.a(objA) != null) {
                        if (view.getId() == -1) {
                            objA = null;
                        } else {
                            StringBuilder sb = new StringBuilder("0x");
                            String string3 = Integer.toString(view.getId(), CharsKt.checkRadix(16));
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(this, checkRadix(radix))");
                            sb.append(string3);
                            objA = sb.toString();
                        }
                    }
                    String str2 = (String) objA;
                    ArrayList arrayList = new ArrayList();
                    View view3 = view;
                    while (view3 != null) {
                        String simpleName = view3.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "currentView.javaClass.simpleName");
                        arrayList.add(simpleName);
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                    }
                    String strJ = CollectionsKt.J(arrayList, " → ", null, null, null, 62);
                    Object tag = view.getTag();
                    if (tag == null) {
                        string = null;
                    } else {
                        if (!(tag instanceof String) && !(tag instanceof Number) && !(tag instanceof Boolean) && !(tag instanceof Character)) {
                            tag = null;
                        }
                        if (tag != null) {
                            string = tag.toString();
                        } else {
                            string = null;
                        }
                    }
                    Button button = view instanceof Button ? (Button) view : null;
                    if (button != null && (text = button.getText()) != null) {
                        string2 = text.toString();
                    }
                    return new C6814te2(view, str, str2, string, string2, "android_view", strJ);
                } catch (Throwable th) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    objA = C1795Pt1.a(th);
                }
            }
        }
        return null;
    }
}
