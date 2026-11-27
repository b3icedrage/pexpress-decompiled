package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContextView;
import com.pexpress.tool.R;
import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import java.util.zip.ZipInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5642o31 implements InterfaceC0726Cc, K81 {
    public final Object d;

    public C5642o31(Context context) {
        this.d = C3227cm2.b(new C7173vM(C3227cm2.b(new C6862ts(new C4066gm2(context), C3227cm2.b(C3043bv.a), new ED()))));
    }

    public static /* synthetic */ void G0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @NonNull
    public JU0 H0(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2, String str3) {
        JU0<C3788fU0> ju0F;
        JU0<C3788fU0> ju0C;
        EnumC1665Oc0 enumC1665Oc0;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C5009l31 c5009l31 = (C5009l31) this.d;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            CS0.a();
            EnumC1665Oc0 enumC1665Oc1 = EnumC1665Oc0.ZIP;
            if (str3 != null) {
                File fileC = c5009l31.c(str, inputStream, enumC1665Oc1);
                ju0F = C5729oU0.f(context, new ZipInputStream(f.a.a(fileC, new FileInputStream(fileC))), str);
            } else {
                ju0F = C5729oU0.f(context, new ZipInputStream(inputStream), null);
            }
            ju0C = ju0F;
            enumC1665Oc0 = enumC1665Oc1;
        } else {
            CS0.a();
            enumC1665Oc0 = EnumC1665Oc0.JSON;
            if (str3 != null) {
                String absolutePath = c5009l31.c(str, inputStream, enumC1665Oc0).getAbsolutePath();
                ju0C = C5729oU0.c(f.a.c(new FileInputStream(absolutePath), absolutePath), str);
            } else {
                ju0C = C5729oU0.c(inputStream, null);
            }
        }
        if (str3 != null && ju0C.a != null) {
            File file = new File(c5009l31.b(), C5009l31.a(str, enumC1665Oc0, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            CS0.a();
            if (!zRenameTo) {
                CS0.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return ju0C;
    }

    @Override // defpackage.K81
    public C3006bj2 N(View view, C3006bj2 c3006bj2) {
        boolean z;
        C3006bj2.e cVar;
        boolean z2;
        boolean z3;
        C3006bj2 c3006bj2B = c3006bj2;
        int iD = c3006bj2B.d();
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) this.d;
        layoutInflaterFactory2C3192ce.getClass();
        int iD2 = c3006bj2B.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C3192ce.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C3192ce.z.getLayoutParams();
            if (layoutInflaterFactory2C3192ce.z.isShown()) {
                if (layoutInflaterFactory2C3192ce.h0 == null) {
                    layoutInflaterFactory2C3192ce.h0 = new Rect();
                    layoutInflaterFactory2C3192ce.i0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C3192ce.h0;
                Rect rect2 = layoutInflaterFactory2C3192ce.i0;
                rect.set(c3006bj2B.b(), c3006bj2B.d(), c3006bj2B.c(), c3006bj2B.a());
                ViewGroup viewGroup = layoutInflaterFactory2C3192ce.F;
                Method method = Je2.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C3192ce.F;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                C3006bj2 c3006bj2A = Cd2.e.a(viewGroup2);
                int iB = c3006bj2A == null ? 0 : c3006bj2A.b();
                int iC = c3006bj2A == null ? 0 : c3006bj2A.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C3192ce.o;
                if (i <= 0 || layoutInflaterFactory2C3192ce.H != null) {
                    View view2 = layoutInflaterFactory2C3192ce.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            layoutInflaterFactory2C3192ce.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C3192ce.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    layoutInflaterFactory2C3192ce.F.addView(layoutInflaterFactory2C3192ce.H, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C3192ce.H;
                boolean z4 = view4 != null;
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C3192ce.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C6333rM.getColor(context, R.color.abc_decor_view_status_guard_light) : C6333rM.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C3192ce.M && z4) {
                    iD2 = 0;
                }
                z = z4;
                z2 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                layoutInflaterFactory2C3192ce.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C3192ce.H;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = c3006bj2B.b();
            int iC2 = c3006bj2B.c();
            int iA = c3006bj2B.a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                cVar = new C3006bj2.d(c3006bj2B);
            } else {
                cVar = i6 >= 29 ? new C3006bj2.c(c3006bj2B) : new C3006bj2.b(c3006bj2B);
            }
            cVar.g(LA0.b(iB2, iD2, iC2, iA));
            c3006bj2B = cVar.b();
        }
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        WindowInsets windowInsetsF = c3006bj2B.f();
        if (windowInsetsF == null) {
            return c3006bj2B;
        }
        WindowInsets windowInsetsB = Cd2.c.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? C3006bj2.g(view, windowInsetsB) : c3006bj2B;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public InterfaceC2396Xc k() {
        InterfaceC2396Xc interfaceC2396Xc = (InterfaceC2396Xc) this.d;
        if (interfaceC2396Xc != null) {
            return interfaceC2396Xc;
        }
        G0(1);
        throw null;
    }

    public C5642o31(@NotNull InterfaceC2396Xc interfaceC2396Xc) {
        if (interfaceC2396Xc != null) {
            this.d = interfaceC2396Xc;
        } else {
            G0(0);
            throw null;
        }
    }

    public C5642o31(C5009l31 c5009l31, @NonNull C5189lv c5189lv) {
        this.d = c5009l31;
    }

    public C5642o31(LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce) {
        this.d = layoutInflaterFactory2C3192ce;
    }
}
