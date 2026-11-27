package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1278Je {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final C2703aM1<String, Constructor<? extends View>> h = new C2703aM1<>();
    public final Object[] a = new Object[2];

    /* JADX INFO: renamed from: Je$a */
    public static class a implements View.OnClickListener {
        public final View d;
        public final String e;
        public Method g;
        public Context h;

        public a(@NonNull View view, @NonNull String str) {
            this.d = view;
            this.e = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String str;
            Method method;
            if (this.g != null) {
                break;
            }
            View view2 = this.d;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.e;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbB = C6495s7.b("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbB.append(view2.getClass());
                    sbB.append(str);
                    throw new IllegalStateException(sbB.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.g = method;
                        this.h = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.g.invoke(this.h, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    @NonNull
    public C1823Qd a(Context context, AttributeSet attributeSet) {
        return new C1823Qd(context, attributeSet);
    }

    @NonNull
    public C1979Sd b(Context context, AttributeSet attributeSet) {
        return new C1979Sd(context, attributeSet);
    }

    @NonNull
    public C2135Ud c(Context context, AttributeSet attributeSet) {
        return new C2135Ud(context, attributeSet);
    }

    @NonNull
    public C7021ue d(Context context, AttributeSet attributeSet) {
        return new C7021ue(context, attributeSet);
    }

    @NonNull
    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        C2703aM1<String, Constructor<? extends View>> c2703aM1 = h;
        Constructor<? extends View> orDefault = c2703aM1.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            orDefault = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            c2703aM1.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.a);
    }
}
