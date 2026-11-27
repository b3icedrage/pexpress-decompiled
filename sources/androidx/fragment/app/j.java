package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.AbstractC4726ji0;
import defpackage.C1039Gc0;
import defpackage.C1057Gi0;
import defpackage.C1135Hi0;
import defpackage.C2793am1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements LayoutInflater.Factory2 {
    public final FragmentManager d;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ o d;

        public a(o oVar) {
            this.d = oVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            o oVar = this.d;
            oVar.i();
            s.f((ViewGroup) oVar.c.mView.getParent(), j.this.d).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public j(FragmentManager fragmentManager) {
        this.d = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        o oVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.d;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2793am1.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(i.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragment = resourceId != -1 ? fragmentManager.A(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = fragmentManager.B(string);
                    }
                    if (fragment == null && id != -1) {
                        fragment = fragmentManager.A(id);
                    }
                    if (fragment == null) {
                        fragment = fragmentManager.E().a(context.getClassLoader(), attributeValue);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragment.mContainerId = id;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = fragmentManager;
                        AbstractC4726ji0<?> abstractC4726ji0 = fragmentManager.u;
                        fragment.mHost = abstractC4726ji0;
                        fragment.onInflate((Context) abstractC4726ji0.e, attributeSet, fragment.mSavedFragmentState);
                        oVarF = fragmentManager.a(fragment);
                        if (FragmentManager.G(2)) {
                            fragment.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (fragment.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = fragmentManager;
                        AbstractC4726ji0<?> abstractC4726ji1 = fragmentManager.u;
                        fragment.mHost = abstractC4726ji1;
                        fragment.onInflate((Context) abstractC4726ji1.e, attributeSet, fragment.mSavedFragmentState);
                        oVarF = fragmentManager.f(fragment);
                        if (FragmentManager.G(2)) {
                            fragment.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C1057Gi0.b bVar = C1057Gi0.a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    C1057Gi0.b(new C1135Hi0(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup));
                    C1057Gi0.a(fragment).a.contains(C1057Gi0.a.e);
                    fragment.mContainer = viewGroup;
                    oVarF.i();
                    oVarF.h();
                    View view2 = fragment.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(C1039Gc0.d("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new a(oVarF));
                    return fragment.mView;
                }
            }
        }
        return null;
    }
}
