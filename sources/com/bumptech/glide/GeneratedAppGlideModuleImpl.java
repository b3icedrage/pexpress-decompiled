package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.b;
import com.github.twocoffeesoneteam.glidetovectoryou.SvgModule;
import defpackage.C0751Ck0;
import defpackage.C2596Zq1;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final SvgModule a = new SvgModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        Log.isLoggable("Glide", 3);
    }

    @Override // defpackage.AbstractC6343rP0
    public final void a(@NonNull Context context, @NonNull a aVar, @NonNull C2596Zq1 c2596Zq1) {
        this.a.a(context, aVar, c2596Zq1);
    }

    @Override // defpackage.AbstractC0972Fg
    public final void b() {
        this.a.getClass();
    }

    @Override // defpackage.AbstractC0972Fg
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final Set<Class<?>> d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final b.InterfaceC0305b e() {
        return new C0751Ck0();
    }
}
