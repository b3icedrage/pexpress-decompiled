package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4014gZ1 implements InterfaceC3804fZ1 {
    public final int a;

    public C4014gZ1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = C6333rM.getColor(context, R.color.altSurface);
    }

    @Override // defpackage.InterfaceC3804fZ1
    public final int a() {
        return this.a;
    }
}
