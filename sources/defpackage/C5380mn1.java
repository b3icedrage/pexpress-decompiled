package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5380mn1 implements InterfaceC5167ln1 {

    @NotNull
    public final Context a;

    public C5380mn1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC5167ln1
    @NotNull
    public final String a() {
        String string = this.a.getString(R.string.terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC5167ln1
    @NotNull
    public final String b() {
        String string = this.a.getString(R.string.privacy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC5167ln1
    @NotNull
    public final String c() {
        String string = this.a.getString(R.string.by_using_app);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC7749y50
    @NotNull
    public final String d() {
        String string = this.a.getString(R.string.platform_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC7749y50
    @NotNull
    public final String e() {
        String string = this.a.getString(R.string.app_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
