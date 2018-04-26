(ns quotes-30-rock.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def quotes
  ["Science is my most favorite subject, especially the Old Testament! - Kenneth Parcel"
   "Laugh! You sons of bitches! - Tracy Jordan" ]
  )
(defroutes app-routes
  (GET "/" [] (rand-nth quotes))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
