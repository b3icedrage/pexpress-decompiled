package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LT90;", "", "LU90;", "result", "", "", "idTranslations", "", "LQ91;", "operations", "", "retryAfterSeconds", "<init>", "(LU90;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;)V", "LU90;", "getResult", "()LU90;", "Ljava/util/Map;", "getIdTranslations", "()Ljava/util/Map;", "Ljava/util/List;", "getOperations", "()Ljava/util/List;", "Ljava/lang/Integer;", "getRetryAfterSeconds", "()Ljava/lang/Integer;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class T90 {

    @Nullable
    private final Map<String, String> idTranslations;

    @Nullable
    private final List<Q91> operations;

    @NotNull
    private final U90 result;

    @Nullable
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public T90(@NotNull U90 result, @Nullable Map<String, String> map, @Nullable List<? extends Q91> list, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }

    @Nullable
    public final Map<String, String> getIdTranslations() {
        return this.idTranslations;
    }

    @Nullable
    public final List<Q91> getOperations() {
        return this.operations;
    }

    @NotNull
    public final U90 getResult() {
        return this.result;
    }

    @Nullable
    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public /* synthetic */ T90(U90 u90, Map map, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u90, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num);
    }
}
