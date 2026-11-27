package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LJp;", "", "", "image", "titleTextColor", "bodyTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "getTitleTextColor", "getBodyTextColor", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1311Jp {

    @Nullable
    private final String bodyTextColor;

    @Nullable
    private final String image;

    @Nullable
    private final String titleTextColor;

    public C1311Jp() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final String getBodyTextColor() {
        return this.bodyTextColor;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    public C1311Jp(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.image = str;
        this.titleTextColor = str2;
        this.bodyTextColor = str3;
    }

    public /* synthetic */ C1311Jp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
