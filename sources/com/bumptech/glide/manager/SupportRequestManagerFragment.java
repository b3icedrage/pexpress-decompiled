package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.C6177qc2;
import defpackage.DP0;
import defpackage.Z6;
import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {
    public final Z6 d;
    public final HashSet e;
    public SupportRequestManagerFragment g;

    public SupportRequestManagerFragment() {
        Z6 z6 = new Z6();
        this.e = new HashSet();
        this.d = z6;
    }

    public final void i(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.g;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.e.remove(this);
            this.g = null;
        }
        b bVar = com.bumptech.glide.a.a(context).i;
        HashMap map = bVar.c;
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) map.get(fragmentManager);
        if (supportRequestManagerFragment2 == null) {
            SupportRequestManagerFragment supportRequestManagerFragment3 = (SupportRequestManagerFragment) fragmentManager.B("com.bumptech.glide.manager");
            if (supportRequestManagerFragment3 == null) {
                supportRequestManagerFragment3 = new SupportRequestManagerFragment();
                map.put(fragmentManager, supportRequestManagerFragment3);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.c(0, supportRequestManagerFragment3, "com.bumptech.glide.manager", 1);
                aVar.e(true);
                bVar.d.obtainMessage(2, fragmentManager).sendToTarget();
            }
            supportRequestManagerFragment2 = supportRequestManagerFragment3;
        }
        this.g = supportRequestManagerFragment2;
        if (equals(supportRequestManagerFragment2)) {
            return;
        }
        this.g.e.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                b0.e("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                i(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    b0.f("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.d.b();
        SupportRequestManagerFragment supportRequestManagerFragment = this.g;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.e.remove(this);
            this.g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        SupportRequestManagerFragment supportRequestManagerFragment = this.g;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.e.remove(this);
            this.g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Z6 z6 = this.d;
        z6.e = true;
        Iterator it = C6177qc2.e(z6.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Z6 z6 = this.d;
        z6.e = false;
        Iterator it = C6177qc2.e(z6.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
