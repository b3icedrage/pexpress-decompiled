package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.media.MediaSignResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7631xY0 extends AbstractC7841yY0 {
    public final /* synthetic */ AbstractC7841yY0.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7631xY0(AbstractC7841yY0.a aVar, InterfaceC5889pD1 interfaceC5889pD1) {
        super(interfaceC5889pD1);
        this.b = aVar;
    }

    @Override // defpackage.AbstractC7841yY0
    @NotNull
    public final C1351Kc0 a() {
        C7113v4 c7113v4 = this.b.c;
        if (c7113v4 != null) {
            return (C1351Kc0) c7113v4.e;
        }
        throw new IllegalArgumentException("You need to declare file method");
    }

    @Override // defpackage.AbstractC7841yY0
    @NotNull
    public final LiveData<C4705jd<MediaSignResponse>> b() {
        C3598ea2 c3598ea2 = this.b.b;
        if (c3598ea2 != null) {
            return c3598ea2.invoke();
        }
        throw new IllegalArgumentException("You need to declare getAccess method");
    }

    @Override // defpackage.AbstractC7841yY0
    @NotNull
    public final LiveData<C4705jd<Void>> e(@Nullable String str, @NotNull String url, @NotNull AbstractC5395ms1 body) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        C3808fa2 c3808fa2 = this.b.d;
        if (c3808fa2 != null) {
            return c3808fa2.k(str, url, body);
        }
        throw new IllegalArgumentException("You need to declare upload method");
    }
}
