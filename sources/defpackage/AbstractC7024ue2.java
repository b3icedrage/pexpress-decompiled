package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ue2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC7024ue2<T extends View, Z> extends AbstractC1940Rq<Z> {
    public final ImageView d;
    public final a e;

    /* JADX INFO: renamed from: ue2$a */
    public static final class a {
        public static Integer d;
        public final ImageView a;
        public final ArrayList b = new ArrayList();
        public ViewTreeObserverOnPreDrawListenerC0505a c;

        /* JADX INFO: renamed from: ue2$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0505a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> d;

            public ViewTreeObserverOnPreDrawListenerC0505a(@NonNull a aVar) {
                this.d = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = this.d.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = aVar.a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iA2 = aVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((NM1) it.next()).a(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.c);
                }
                aVar.c = null;
                arrayList.clear();
                return true;
            }
        }

        public a(@NonNull ImageView imageView) {
            this.a = imageView;
        }

        public final int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            ImageView imageView = this.a;
            if (imageView.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            Context context = imageView.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                UE.e(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
    }

    public AbstractC7024ue2(@NonNull ImageView imageView) {
        UE.e(imageView, "Argument must not be null");
        this.d = imageView;
        this.e = new a(imageView);
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void a(@NonNull DM1 dm1) {
        this.e.b.remove(dm1);
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void b(@NonNull DM1 dm1) throws Throwable {
        a aVar = this.e;
        ImageView imageView = aVar.a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = aVar.a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = aVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            dm1.a(iA, iA2);
            return;
        }
        ArrayList arrayList = aVar.b;
        if (!arrayList.contains(dm1)) {
            arrayList.add(dm1);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0505a viewTreeObserverOnPreDrawListenerC0505a = new a.ViewTreeObserverOnPreDrawListenerC0505a(aVar);
            aVar.c = viewTreeObserverOnPreDrawListenerC0505a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0505a);
        }
    }

    @Override // defpackage.InterfaceC5529nX1
    public final InterfaceC4762js1 d() {
        Object tag = this.d.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC4762js1) {
            return (InterfaceC4762js1) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void e(InterfaceC4762js1 interfaceC4762js1) {
        this.d.setTag(R.id.glide_custom_view_target_tag, interfaceC4762js1);
    }

    @Override // defpackage.InterfaceC5529nX1
    public void k(Drawable drawable) {
        a aVar = this.e;
        ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.c);
        }
        aVar.c = null;
        aVar.b.clear();
    }

    public final String toString() {
        return "Target for: " + this.d;
    }
}
