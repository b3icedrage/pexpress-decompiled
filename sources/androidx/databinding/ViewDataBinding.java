package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.pexpress.tool.R;
import defpackage.C5302mS;
import defpackage.EP0;
import defpackage.EY0;
import defpackage.FP0;
import defpackage.Fd2;
import defpackage.InterfaceC3511e81;
import defpackage.InterfaceC4819k81;
import defpackage.InterfaceC5089lS;
import defpackage.InterfaceC7441wd2;
import defpackage.Jf2;
import defpackage.LE;
import io.sentry.android.core.b0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewDataBinding extends LE implements InterfaceC7441wd2 {
    public static final boolean u = true;
    public static final a v = new a();
    public static final ReferenceQueue<ViewDataBinding> w = new ReferenceQueue<>();
    public static final b x = new b();
    public final c i;
    public boolean j;
    public final Jf2[] k;
    public final View l;
    public boolean m;
    public final Choreographer n;
    public final Fd2 o;
    public final Handler p;
    public final InterfaceC5089lS q;
    public FP0 r;
    public OnStartListener s;
    public boolean t;

    public static class OnStartListener implements EP0 {
        public final WeakReference<ViewDataBinding> d;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.d = new WeakReference<>(viewDataBinding);
        }

        @m(g.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.d.get();
            if (viewDataBinding != null) {
                if (viewDataBinding.m) {
                    viewDataBinding.v();
                } else if (viewDataBinding.p()) {
                    viewDataBinding.m = true;
                    viewDataBinding.o();
                    viewDataBinding.m = false;
                }
            }
        }
    }

    public class a {
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).i.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.j = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> referencePoll = ViewDataBinding.w.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof Jf2) {
                    ((Jf2) referencePoll).a();
                }
            }
            if (!ViewDataBinding.this.l.isAttachedToWindow()) {
                View view = ViewDataBinding.this.l;
                b bVar = ViewDataBinding.x;
                view.removeOnAttachStateChangeListener(bVar);
                ViewDataBinding.this.l.addOnAttachStateChangeListener(bVar);
                return;
            }
            ViewDataBinding viewDataBinding = ViewDataBinding.this;
            if (viewDataBinding.m) {
                viewDataBinding.v();
            } else if (viewDataBinding.p()) {
                viewDataBinding.m = true;
                viewDataBinding.o();
                viewDataBinding.m = false;
            }
        }
    }

    public static class d implements InterfaceC4819k81, InterfaceC3511e81<LiveData<?>> {
        public final Jf2<LiveData<?>> a;
        public WeakReference<FP0> b = null;

        public d(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.a = new Jf2<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // defpackage.InterfaceC3511e81
        public final void a(LiveData liveData) {
            liveData.j(this);
        }

        @Override // defpackage.InterfaceC3511e81
        public final void b(FP0 fp0) {
            WeakReference<FP0> weakReference = this.b;
            FP0 fp1 = weakReference == null ? null : weakReference.get();
            LiveData liveData = this.a.c;
            if (liveData != null) {
                if (fp1 != null) {
                    liveData.j(this);
                }
                if (fp0 != null) {
                    liveData.e(fp0, this);
                }
            }
            if (fp0 != null) {
                this.b = new WeakReference<>(fp0);
            }
        }

        @Override // defpackage.InterfaceC3511e81
        public final void c(LiveData liveData) {
            WeakReference<FP0> weakReference = this.b;
            FP0 fp0 = weakReference == null ? null : weakReference.get();
            if (fp0 != null) {
                liveData.e(fp0, this);
            }
        }

        @Override // defpackage.InterfaceC4819k81
        public final void d(Object obj) {
            Jf2<LiveData<?>> jf2 = this.a;
            ViewDataBinding viewDataBinding = (ViewDataBinding) jf2.get();
            if (viewDataBinding == null) {
                jf2.a();
            }
            if (viewDataBinding != null) {
                LiveData liveData = jf2.c;
                if (viewDataBinding.t || !viewDataBinding.t(liveData, jf2.b, 0)) {
                    return;
                }
                viewDataBinding.v();
            }
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        InterfaceC5089lS interfaceC5089lS;
        if (obj == null) {
            interfaceC5089lS = null;
        } else {
            if (!(obj instanceof InterfaceC5089lS)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            interfaceC5089lS = (InterfaceC5089lS) obj;
        }
        this.i = new c();
        this.j = false;
        this.q = interfaceC5089lS;
        this.k = new Jf2[i];
        this.l = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (u) {
            this.n = Choreographer.getInstance();
            this.o = new Fd2(this);
        } else {
            this.o = null;
            this.p = new Handler(Looper.myLooper());
        }
    }

    public static ViewDataBinding n(Object obj, View view, int i) {
        InterfaceC5089lS interfaceC5089lS;
        if (obj == null) {
            interfaceC5089lS = null;
        } else {
            if (!(obj instanceof InterfaceC5089lS)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            interfaceC5089lS = (InterfaceC5089lS) obj;
        }
        return C5302mS.a.b(interfaceC5089lS, view, i);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092 A[ADDED_TO_REGION] */
    public static void q(View view, Object[] objArr, SparseIntArray sparseIntArray, boolean z) {
        int id;
        int i;
        int i2;
        int length;
        if ((view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (z && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf <= 0 || (length = str.length()) == (i2 = iLastIndexOf + 1)) {
                id = view.getId();
                if (id > 0) {
                    objArr[i] = view;
                }
            } else {
                int i3 = i2;
                while (true) {
                    if (i3 >= length) {
                        int length2 = str.length();
                        int iCharAt = 0;
                        while (i2 < length2) {
                            iCharAt = (iCharAt * 10) + (str.charAt(i2) - '0');
                            i2++;
                        }
                        if (objArr[iCharAt] == null) {
                            objArr[iCharAt] = view;
                        }
                    } else if (Character.isDigit(str.charAt(i3))) {
                        i3++;
                    } else {
                        id = view.getId();
                        if (id > 0) {
                            objArr[i] = view;
                        }
                    }
                }
            }
        } else if (str == null || !str.startsWith("binding_")) {
            id = view.getId();
            if (id > 0 && sparseIntArray != null && (i = sparseIntArray.get(id, -1)) >= 0 && objArr[i] == null) {
                objArr[i] = view;
            }
        } else {
            int length3 = str.length();
            int iCharAt2 = 0;
            for (int i4 = 8; i4 < length3; i4++) {
                iCharAt2 = (iCharAt2 * 10) + (str.charAt(i4) - '0');
            }
            if (objArr[iCharAt2] == null) {
                objArr[iCharAt2] = view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                q(viewGroup.getChildAt(i5), objArr, sparseIntArray, false);
            }
        }
    }

    public static Object[] s(View view, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        q(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public static boolean w(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.l;
    }

    public abstract void o();

    public abstract boolean p();

    public abstract boolean t(Object obj, int i, int i2);

    public final void u(int i, LiveData liveData, a aVar) {
        if (liveData == null) {
            return;
        }
        Jf2<LiveData<?>>[] jf2Arr = this.k;
        Jf2<LiveData<?>> jf2 = jf2Arr[i];
        if (jf2 == null) {
            ReferenceQueue<ViewDataBinding> referenceQueue = w;
            aVar.getClass();
            jf2 = new d(this, i, referenceQueue).a;
            jf2Arr[i] = jf2;
            FP0 fp0 = this.r;
            if (fp0 != null) {
                jf2.a.b(fp0);
            }
        }
        jf2.a();
        jf2.c = liveData;
        jf2.a.c(liveData);
    }

    public final void v() {
        FP0 fp0 = this.r;
        if (fp0 == null || fp0.getLifecycle().b().b(g.b.h)) {
            synchronized (this) {
                try {
                    if (this.j) {
                        return;
                    }
                    this.j = true;
                    if (u) {
                        this.n.postFrameCallback(this.o);
                    } else {
                        this.p.post(this.i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void x(FP0 fp0) {
        if (fp0 instanceof Fragment) {
            b0.e("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        FP0 fp1 = this.r;
        if (fp1 == fp0) {
            return;
        }
        if (fp1 != null) {
            fp1.getLifecycle().c(this.s);
        }
        this.r = fp0;
        if (fp0 != null) {
            if (this.s == null) {
                this.s = new OnStartListener(this);
            }
            fp0.getLifecycle().a(this.s);
        }
        for (Jf2 jf2 : this.k) {
            if (jf2 != null) {
                jf2.a.b(fp0);
            }
        }
    }

    public final void y(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public final void z(int i, EY0 ey0) {
        this.t = true;
        try {
            a aVar = v;
            if (ey0 == null) {
                Jf2 jf2 = this.k[i];
                if (jf2 != null) {
                    jf2.a();
                }
            } else {
                Jf2 jf3 = this.k[i];
                if (jf3 == null) {
                    u(i, ey0, aVar);
                } else if (jf3.c != ey0) {
                    if (jf3 != null) {
                        jf3.a();
                    }
                    u(i, ey0, aVar);
                }
            }
        } finally {
            this.t = false;
        }
    }
}
