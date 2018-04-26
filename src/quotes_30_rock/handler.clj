(ns quotes-30-rock.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Laugh! You sons of bitches! - Tracy Jordan")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
