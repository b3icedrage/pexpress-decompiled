package com.api.core;

import androidx.fragment.app.Fragment;
import com.pexpress.tool.R;
import defpackage.C5653o60;
import defpackage.InterfaceC7271vo0;
import defpackage.R51;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/api/core/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lvo0;", "<init>", "()V", R51.PUSH_ADDITIONAL_DATA_KEY, "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseFragment extends Fragment implements InterfaceC7271vo0 {

    @Nullable
    public final Integer d = Integer.valueOf(R.color.background);

    @NotNull
    public String e;

    @NotNull
    public final C5653o60 g;

    public static abstract class a {

        /* JADX INFO: renamed from: com.api.core.BaseFragment$a$a, reason: collision with other inner class name */
        public static final class C0265a extends a {

            @NotNull
            public static final C0265a a = new C0265a();
        }

        public static final class b extends a {

            @NotNull
            public static final b a = new b();
        }

        public static final class c extends a {

            @NotNull
            public static final c a = new c();
        }

        public static final class d extends a {

            @NotNull
            public static final d a = new d();
        }
    }

    public BaseFragment() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.e = simpleName;
        this.g = C5653o60.d;
    }

    @Override // defpackage.InterfaceC7271vo0
    public void d() {
    }

    @Override // defpackage.InterfaceC7271vo0
    public void f() {
    }

    @NotNull
    public List<a> i() {
        return this.g;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public Integer getM() {
        return this.d;
    }
}
